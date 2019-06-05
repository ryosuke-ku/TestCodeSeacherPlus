from bs4 import BeautifulSoup
from collections import defaultdict
import urllib.request as req
import re
import csv

# テスト用のHTML
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/utility_functions-blind-clones/utility_functions-blind-clones-0.30-classes-withsource.html"
url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/apache_ant_functions-blind-clones/apache_ant_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/android_project_functions-blind-clones/android_project_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/apache_2_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/android_platform_projects_functions-blind-clones/android_platform_projects_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/apache_activemq_projects_functions-blind-clones/apache_activemq_projects_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven_functions-blind-clones/maven_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/apache_ant_maven_functions-blind-clones/apache_ant_maven_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/Server_Projects_functions-blind-clones/Server_Projects_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/RxJava_functions-blind-clones/RxJava_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/RYOSUKE/Desktop/NiCad-5.1/systems/JHotDraw54b1_functions-blind-clones/JHotDraw54b1_functions-blind-clones-0.30-classes-withsource.html"
res = req.urlopen(url)

# HTMLを解析

soup = BeautifulSoup(res, "html.parser")

# 任意のデータを抽出 --- (※1)
f = open('DetectedProductionCodePath.txt','w')

data = defaultdict(list)
product_div = soup.find('body')

codearray = []
countarray = []
count = 0 

# クローンクラス<h3>の配列を作成し,類似コードが存在するファイルパス<td>を要素として配列に格納する処理
for product in product_div.find_all(['h3', 'td']):
	if product.name == 'h3':
		key = product.text.replace('\n','').replace('\r','')
		f.write(key)
		f.write("\n")
	if key and product.name == 'td':
		try:
			srccode = product.find('pre')
			# print(srccode.string)
			codearray.append(srccode.text)
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
		countarray.append(count)
		count +=1


print(len(countarray))
print(len(codearray))
# print(data)

codedic = dict(zip(countarray,codearray))


production = open(r'C:\Users\ryosuke-ku\Desktop\Path\ProductionCode.txt','r',encoding="utf-8_sig")
ProductionPath = production.readlines()
PPath = [Pline.replace('\n', '') for Pline in ProductionPath]

production.close()
#print(ProductionPath)

Test = open(r'C:\Users\ryosuke-ku\Desktop\Path\TestCode.txt','r',encoding="utf-8_sig")
TestPath = Test.readlines()
TPath = [Tline.replace('\n', '') for Tline in TestPath]

Test.close()
#print(TestPath)

dic = dict(zip(PPath,TPath))

# csvFile = open("Codefragments.csv", 'wt', newline='', encoding='utf-8')
# writer = csv.writer(csvFile)


f = open('DetectedTestCodePath.txt','w')
r = open('RxJava_result.txt','w', encoding='utf-8')
nt = 0
at = 0
pt = 0
totalpairs = 0
totalfragments = 0
notest = 0

for i in data:
	f.write(i)
	f.write("\n") 
#	print(i)
	fragments = len(data[i])
	# print(len(data[i]))
	count = 0
	# writer.writerow(data[i])

	for j in data[i]:
		# print(j)
		try:
			path = dic.get(j)
		except KeyError:
			pass
		# print(path)
		if path is None:
			pass
		else:
			f.write(path) 
			f.write("\n")
	
			count += 1
			# print(path)
	
	# print(count)
	judgment = fragments - count
	if judgment == fragments:
		# print("テストコードが見つかりませんでした")
		nt += 1
	elif judgment == 0:
		#print("すべてのコードフラグメントがテストコードを持っています")
		at += 1
	elif 0 < judgment < fragments :
		#print("クローンペアのうち少なくとも一つのコードフラグメントはテストコードを持っています")
		#print("他のテストを再利用できそうなフラグメントの数："+ str(judgment))
		notest += judgment
		pt +=1


#	print(len(data[i])*(len(data[i])-1)/2)
	totalpairs += len(data[i])*(len(data[i])-1)/2
	totalfragments += fragments

# csvFile.close()
print("\n")
print("----------------------------------------------------------------------------------------------------")
print("＜クローンクラス＞")
print("すべてのクローンClassの数：" + str(nt + pt + at))
print("テストコードが見つからなかったクローンClassの数：" + str(nt) + " (" + str(round(nt/(nt + pt + at)*100,1)) + "％)")
print("少なくとも一つのコードフラグメントはテストコードを持っているクローンClassの数：" + str(pt)+ " (" + str(round(pt/(nt + pt + at)*100,1)) + "％)")
print("すべてのコードフラグメントがテストコードを持っているクローンClassの数：" + str(at) + " (" + str(round(at/(nt + pt + at)*100,1)) + "％)")
print("----------------------------------------------------------------------------------------------------")
print("＜クローンペア＞")
print("クローンペアの合計数："+ str(round(totalpairs)))
print("コードフラグメントの合計数："+ str(totalfragments))
print("他のテストを再利用できそうなフラグメントの数："+ str(notest) + " (" + str(round(notest/totalfragments*100, 1)) + "％)")
print("----------------------------------------------------------------------------------------------------")

r.write("-----------------------------------------------------------------------------------")
r.write("\n")
r.write(str(nt) + " テストコードが見つかりませんでした ")
r.write("\n")
r.write(str(pt) + " クローンClassのうち少なくとも一つのコードフラグメントはテストコードを持っています ")
r.write("\n")
r.write(str(at) + " すべてのコードフラグメントがテストコードを持っています ")
r.write("\n")
r.write("-----------------------------------------------------------------------------------")


cnt = 0
for k in data:
	# print(k)
	for s in data[k]:
		try:
			codepath = dic.get(s)

		except KeyError:
			pass


		if codepath is None:
			# print(codedic.get(cnt))
			cnt += 1
			# print(s)

		else:
			cnt += 1 