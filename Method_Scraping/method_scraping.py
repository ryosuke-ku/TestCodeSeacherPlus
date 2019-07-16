from bs4 import BeautifulSoup
from collections import defaultdict
import urllib.request as req
import re
import csv
import collections

# テスト用のHTML
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/utility_functions-blind-clones/utility_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/apache_ant_functions-blind-clones/apache_ant_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/android_project_functions-blind-clones/android_project_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/apache_2_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/android_platform_projects_functions-blind-clones/android_platform_projects_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/apache_activemq_projects_functions-blind-clones/apache_activemq_projects_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven_functions-blind-clones/maven_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/apache_ant_maven_functions-blind-clones/apache_ant_maven_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/Server_Projects_functions-blind-clones/Server_Projects_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/RxJava_functions-blind-clones/RxJava_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/RYOSUKE/Desktop/NiCad-5.1/systems/JHotDraw54b1_functions-blind-clones/JHotDraw54b1_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/jetty.project_functions-blind-clones/jetty.project_functions-blind-clones-0.30-classes-withsource.html"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/jacoco_functions-blind-clones/jacoco_functions-blind-clones-0.30-classes-withsource.html"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/dubbo_functions-blind-clones/dubbo_functions-blind-clones-0.30-classes-withsource.html"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/flink_functions-blind-clones/flink_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/kafka_functions-blind-clones/kafka_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/apache_camel_functions-blind-clones/apache_camel_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/beam_functions-blind-clones/beam_functions-blind-clones-0.30-classes-withsource.html"
url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/ant_functions-blind-clones/ant_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/cassandra_functions-blind-clones/cassandra_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/httpcomponents-client_functions-blind-clones/httpcomponents-client_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/hadoop_functions-blind-clones/hadoop_functions-blind-clones-0.30-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/ant_functions-clones/ant_functions-clones-0.00-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/ant_functions-blind-clones/ant_functions-blind-clones-0.00-classes-withsource.html"
#url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/hadoop_functions-blind-clones/hadoop_functions-blind-clones-0.00-classes-withsource.html"


res = req.urlopen(url)

# HTMLを解析

soup = BeautifulSoup(res, "html.parser")

# 任意のデータを抽出 --- (※1)


data = defaultdict(list)
product_div = soup.find('body')

codearray = []
countarray = []
count = 0 

# クローンクラス<h3>の配列を作成し,類似コードが存在するファイルパス<td>を要素として配列に格納する処理
for product in product_div.find_all(['h3', 'td']):
	if product.name == 'h3':
		key = product.text.replace('\n','').replace('\r','')
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
		countarray.append(count)
		count +=1


# print(len(countarray))
# print(len(codearray))
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

alltest=0
for p in TPath:
	if re.match('ant.*?/', p):
		alltest += 1

# print(alltest)

Test.close()
#print(TestPath)

dic = dict(zip(PPath,TPath))

nt = 0
at = 0
pt = 0
totalpairs = 0
totalfragments = 0
notest = 0
reusetest = []
list_nt = []
list_at = []
list_pt = []
Similarity = defaultdict(list)
Similarity_total = defaultdict(list)

for i in data:
	rt_path = []
	print("----------------------------------------------------------------------------------------------------")
	print(i)
	fragments = len(data[i])
	# print(len(data[i]))
	count = 0
	# writer.writerow(data[i])
	Similarity_key = i[-4:].replace(" ","")
	print(Similarity_key)

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
			reusetest.append(path)
			rt_path.append(path)
			count += 1
			print(path)
			# Similarity[Similarity_key].append(path)
			# print(Similarity[Similarity_key])
	


	# print(count)
	judgment = fragments - count
	if judgment == fragments:
		print("テストコードが見つかりませんでした")
		nt += 1
		list_nt.append(i[-4:].replace(" ",""))
	elif judgment == 0:
		print("すべてのコードフラグメントがテストコードを持っています")
		at += 1
		list_at.append(i[-4:].replace(" ",""))

	elif 0 < judgment < fragments :
		print("クローンペアのうち少なくとも一つのコードフラグメントはテストコードを持っています")
		#print("他のテストを再利用できそうなフラグメントの数："+ str(judgment))
		notest += judgment
		pt +=1
		list_pt.append(i[-4:].replace(" ",""))
		Similarity_total[Similarity_key].append(rt_path)

print(reusetest)	
print(len(reusetest))










