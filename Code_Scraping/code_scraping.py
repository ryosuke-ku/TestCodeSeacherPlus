from bs4 import BeautifulSoup
from collections import defaultdict
import urllib.request as req
import re
import csv

# テスト用のHTML
url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/utility_functions-blind-clones/utility_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/apache_ant_functions-blind-clones/apache_ant_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/android_project_functions-blind-clones/android_project_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/apache_2_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/android_platform_projects_functions-blind-clones/android_platform_projects_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/apache_activemq_projects_functions-blind-clones/apache_activemq_projects_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven_functions-blind-clones/maven_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/apache_ant_maven_functions-blind-clones/apache_ant_maven_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/Server_Projects_functions-blind-clones/Server_Projects_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/RxJava_functions-blind-clones/RxJava_functions-blind-clones-0.30-classes-withsource.html"
res = req.urlopen(url)

# HTMLを解析

soup = BeautifulSoup(res, "html.parser")

# 任意のデータを抽出 --- (※1)
f = open('DetectedProductionCodePath.txt','w')

data = defaultdict(list)
product_div = soup.find('body')

csvFile = open("Codefragments.csv", 'wt', newline='', encoding='utf_8')
writer = csv.writer(csvFile)

csvarray = []
# csvarray = defaultdict(list)

countarray = []
count = 0 
countarray.append(count)
# クローンクラス<h3>の配列を作成し,類似コードが存在するファイルパス<td>を要素として配列に格納する処理
for product in product_div.find_all(['h3', 'td']):
	if product.name == 'h3':
		key = product.text.replace('\n','').replace('\r','')
		f.write(key)
		f.write("\n")
		# csvarray.append(key)
	if key and product.name == 'td':
		try:
			srccode = product.find('pre')
			# csvarray[key].append(srccode.string)
			print(srccode.string)
			csvarray.append(srccode.text)
			product.find('pre').decompose()
		except AttributeError:
			pass
		path = product.text
		path = product.text.replace('\n','').replace('\r','')
		edit_path = re.sub(r"Lines.*?systems/utility/", "", path)
		edit_path2 = re.sub(r"\n", "", edit_path)
	
		# csvarray.append(edit_path2)
		# csvarray[key].append(edit_path2)

		data[key].append(edit_path)
		f.write(edit_path)
		f.write("\n")
		count +=1
		countarray.append(count)

		# writer.writerow(csvarray[key])

# writer.writerow(csvarray)
# print(countarray)

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

dic = dict(zip(countarray,csvarray))



f = open('DetectedTestCodePath.txt','w')
r = open('RxJava_result.txt','w', encoding='utf-8')
nt = 0
at = 0
pt = 0
totalpairs = 0
totalfragments = 0
notest = 0
codearray = []

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
		# print(path)
		if path is None:
			codearray.append(dic.get(count))
		else:
			f.write(path) 
			f.write("\n")
			count += 1
			print(path)

	print(codearray)
	writer.writerow(csvarray)

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
		print("他のテストを再利用できそうなフラグメントの数："+ str(judgment))
		notest += judgment
		pt +=1

	print(len(data[i])*(len(data[i])-1)/2)
	totalpairs += len(data[i])*(len(data[i])-1)/2
	totalfragments += fragments

csvFile.close()
print("\n")
print("-----------------------------------------------------------------------------------")
print("テストコードが見つかりませんでした " + str(nt))
print("クローンClassのうち少なくとも一つのコードフラグメントはテストコードを持っています " + str(pt))
print("すべてのコードフラグメントがテストコードを持っています " + str(at))
print("クローンペアの合計数："+ str(totalpairs))
print("コードフラグメントの合計数："+ str(totalfragments))
print("他のテストを再利用できそうなフラグメントの数："+ str(notest))
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