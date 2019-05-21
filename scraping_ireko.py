from bs4 import BeautifulSoup
from collections import defaultdict
import urllib.request as req
import re


# テスト用のHTML
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/utility_functions-blind-clones/utility_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/apache_ant_functions-blind-clones/apache_ant_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/android_project_functions-blind-clones/android_project_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/apache_2_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/android_platform_projects_functions-blind-clones/android_platform_projects_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/apache_activemq_projects_functions-blind-clones/apache_activemq_projects_functions-blind-clones-0.30-classes-withsource.html"
url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven_functions-blind-clones/maven_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/apache_ant_maven_functions-blind-clones/apache_ant_maven_functions-blind-clones-0.30-classes-withsource.html"

res = req.urlopen(url)

# HTMLを解析




soup = BeautifulSoup(res, "html.parser")

# 任意のデータを抽出 --- (※1)
f = open('DetectedProductionCodePath.txt','w')

data = defaultdict(list)
product_div = soup.find('body')

# クローンクラス<h3>の配列を作成し,類似コードが存在するファイルパス<td>を要素として配列に格納する処理
for product in product_div.find_all(['h3', 'td']):
	if product.name == 'h3':
		key = product.text.replace('\n','').replace('\r','')
		f.write(key)
		f.write("\n")
	if key and product.name == 'td':
		try:
			product.find('pre').decompose()
		except AttributeError:
			pass
		path = product.text
		path = product.text.replace('\n','').replace('\r','')
		edit_path = re.sub(r"Lines.*?systems/", "", path)
		edit_path2 = re.sub(r"\n", "", edit_path)

		data[key].append(edit_path)
		f.write(edit_path)
		f.write("\n")
# print(data)

production = open(r'C:\Users\ryosuke-ku\Desktop\SCRAPING\ProductionCodePath.txt','r',encoding="utf-8_sig")
ProductionPath = production.readlines()
PPath = [Pline.replace('\n', '') for Pline in ProductionPath]

production.close()
#print(ProductionPath)

Test = open(r'C:\Users\ryosuke-ku\Desktop\SCRAPING\TestCodePath.txt','r',encoding="utf-8_sig")
TestPath = Test.readlines()
TPath = [Tline.replace('\n', '') for Tline in TestPath]

Test.close()
#print(TestPath)

dic = dict(zip(PPath,TPath))

f = open('DetectedTestCodePath.txt','w')
r = open('apache_maven_result.txt','w', encoding='utf-8')
nt = 0
at = 0
pt = 0
for i in data:
	f.write(i)
	f.write("\n") 
	print(i)
	fragments = len(data[i])
	# print(len(data[i]))
	count = 0


	for j in data[i]:
		# print(j)
		try:
			path = dic.get(j)

		except KeyError:
			pass
#		print(path)
		if path is None:
			pass
		else:
			f.write(path) 
			f.write("\n")
			count += 1
			print(path)
	
	# print(count)
	judgment = fragments - count
	if judgment == fragments:
		print("テストコードが見つかりませんでした")
		nt += 1
	elif judgment == 0:
		print("すべてのコードフラグメントがテストコードを持っています")
		at += 1
	elif 0 < judgment < fragments :
		print("クローンペアのうち少なくとも一つのコードフラグメントはテストコードを持っています")
		pt +=1

print("\n")
print("-----------------------------------------------------------------------------------")
print("テストコードが見つかりませんでした " + str(nt))
print("クローンClassのうち少なくとも一つのコードフラグメントはテストコードを持っています " + str(pt))
print("すべてのコードフラグメントがテストコードを持っています " + str(at))
print("-----------------------------------------------------------------------------------")

r.write("-----------------------------------------------------------------------------------")
r.write("\n")
r.write(str(nt) + " テストコードが見つかりませんでした ")
r.write("\n")
r.write(str(pt) + " クローンClassのうち少なくとも一つのコードフラグメントはテストコードを持っています ")
r.write("\n")
r.write(str(at) + " すべてのコードフラグメントがテストコードを持っています ")
r.write("\n")
r.write("-----------------------------------------------------------------------------------")
