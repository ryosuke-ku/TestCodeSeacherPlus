import urllib.request as req
from bs4 import BeautifulSoup as bs4
from collections import defaultdict
import collections


url ="file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven_functions-blind-clones/maven_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/hadoop_functions-blind-clones/hadoop_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/ant_functions-blind-clones/ant_functions-blind-clones-0.30.xml"
# url ="file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/cassandra_functions-blind-clones/cassandra_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/httpcomponents-client_functions-blind-clones/httpcomponents-client_functions-blind-clones-0.30.xml"
# url ="file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/flink_functions-blind-clones/flink_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/kafka_functions-blind-clones/kafka_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/elasticsearch_functions-blind-clones/elasticsearch_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/jacoco_functions-blind-clones/jacoco_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/JCSprout_functions-blind-clones/JCSprout_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/jetty.project_functions-blind-clones/jetty.project_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/retrofit_functions-blind-clones/retrofit_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/RxJava_functions-blind-clones/RxJava_functions-blind-clones-0.30.xml"

res = req.urlopen(url)
#詳しくは省略、上のXMLが返ってくるものと思ってください

startlist = [] #コード片の開始行番号を格納
endlist = [] #コード片の修了行番号を格納

allpathlist = []
NotestPath =[] #ファイルパスを格納(同じファイルパスを区別しない)
numNotestPath =[] #ファイルパスを格納(同じファイルパスを区別する)
soup = bs4(res,'lxml-xml')
data = defaultdict(list)
delTestdata = defaultdict(list)
numdelTestdata = defaultdict(list)

filePaths = soup.find('clones')
count = 0
cnt = 1
num = 1
for filePath in filePaths.find_all(['clone','source']):
	 
	if filePath.name == 'clone':
		count+=1
		key = "clone pairs:" + str(count) + ":"+ filePath.get('similarity') + "%"
		# print(key)
	if key and filePath.name == 'source':
		path = filePath.get('file') #例 systems/apache_ant/ant/src/main/org/apache/tools/ant/AntClassLoader.java
		path = path[8:] #例 systems/apache_ant/ant/src/main/org/apache/tools/ant/AntClassLoader.java →　apache_ant/ant/src/main/org/apache/tools/ant/AntClassLoader.java	
		allpathlist.append(path)
		data[key].append(path)
		cnt+=1
		cutpath = path[-9:] #pathの文字列の末尾から９文字を取得 Test.java かどうかを判定に使う
		if cutpath == 'Test.java':
			pass
		else:
			registerdPath = str(num) + ':' + path # 3:apache_ant/ant/src/main/org/apache/tools/ant/AntClassLoader.java 同じファイルパスを区別するため
			NotestPath.append(path)
			numNotestPath.append(registerdPath)
			startline = filePath.get('startline') #コード片の開始行番号を取得
			endline = filePath.get('endline') #コード片の修了行番号を取得
			startlist.append(startline)
			endlist.append(endline)
			delTestdata[key].append(path)
			numdelTestdata[key].append(registerdPath)
			num += 1


numMapStartline = dict(zip(numNotestPath,startlist)) #keyが識別子numあり
numMapEndline = dict(zip(numNotestPath,endlist)) #keyが識別子numあり

production = open(r'C:\Users\ryosuke-ku\Desktop\Path\ProductionCode.txt','r',encoding="utf-8_sig")
ProductionPath = production.readlines()
PPath = [Pline.replace('\n', '') for Pline in ProductionPath]
production.close()

Test = open(r'C:\Users\ryosuke-ku\Desktop\Path\TestCode.txt','r',encoding="utf-8_sig")
TestPath = Test.readlines()
TPath = [Tline.replace('\n', '') for Tline in TestPath]
Test.close()


dic = dict(zip(PPath,TPath))
data2 = defaultdict(list)

for i in numdelTestdata:
	for j in numdelTestdata[i]:
		delnum = j[2:]
		print(j)
		try:
			path = dic.get(delnum)
			data2[i].append(path)
		except KeyError:
			pass
	


# print(data2)

TwoTestPath =[]
OneTestPath =[]
NoTestPath =[]

two = 0
one = 0
zero = 0
for z in data2:
	c = 0
	for y in data2[z]:
		if y is None:
			c+=1
	
	if c == 0:
		# print('2tests')
		two += 1
		TwoTestPath.append(y)
	if c == 1:
		# print('1test')
		one += 1
		OneTestPath.append(y)
	if c == 2:
		# print('Notest')
		zero += 1
		NoTestPath.append(y)


print('2tests: ' + str(two))
print('1test: ' + str(one))
print('Notest: ' + str(zero))

# print(len(AvailableProPath))
# print(TwoTestPath)
print(len(TwoTestPath))
# print(OneTestPath)
print(len(OneTestPath))







print('NotestPathlen: ' + str(len(NotestPath)))
# delPairs = []
# for t in delTestdata:
# 	for h in delTestdata[t]:
# 		if len(delTestdata[t]) != 2: # クローンペアが２つのコード片からならないものを取得する
# 			delPairs.append(t)
		

# for pairs in delPairs:
# 	delTestdata.pop(pairs)
# for a in numNotestPath:
# 	print(a)

# print('data: ' + str(len(data)))
# print('delTestdata: ' + str(len(delTestdata)))
# print(delTestdata)
# print(len(allpathlist))
# print(len(numNotestPath))
# print(len(startlist))
# print(len(endlist))


AvailableProPath = []
for k in delTestdata:
	for l in delTestdata[k]:
		AvailableProPath.append(l)

# f = 0
# arrabgementdata = defaultdict(list)
# for q in AvailableProPath:
# 	key = "clone pairs:" + str(f)
# 	arrabgementdata[key].append(q)
# 	f += 1

# print(arrabgementdata)
# print(AvailableProPath)
# print(len(AvailableProPath))


# production = open(r'C:\Users\ryosuke-ku\Desktop\Path\ProductionCode.txt','r',encoding="utf-8_sig")
# ProductionPath = production.readlines()
# PPath = [Pline.replace('\n', '') for Pline in ProductionPath]

# production.close()
# #print(ProductionPath)

# Test = open(r'C:\Users\ryosuke-ku\Desktop\Path\TestCode.txt','r',encoding="utf-8_sig")
# TestPath = Test.readlines()
# TPath = [Tline.replace('\n', '') for Tline in TestPath]


# # print(alltest)

# Test.close()
# #print(TestPath)

# dic = dict(zip(PPath,TPath))
# data2 = defaultdict(list)

# for i in delTestdata:
# 	for j in delTestdata[i]:
# 		last9path = j[-9:]
# 		try:
# 			path = dic.get(j)
# 			data2[i].append(path)
# 		except KeyError:
# 			pass
# 		# if path is None:
# 		# 	pass
# 		# else:
# 		# 	data2[i].append(path)


# # print(data2)

# TwoTestPath =[]
# OneTestPath =[]
# NoTestPath =[]

# two = 0
# one = 0
# zero = 0
# for z in data2:
# 	c = 0
# 	for y in data2[z]:
# 		if y is None:
# 			c+=1
	
# 	if c == 0:
# 		print('2tests')
# 		two += 1
# 		TwoTestPath.append(y)
# 	if c == 1:
# 		print('1test')
# 		one += 1
# 		OneTestPath.append(y)
# 	if c == 2:
# 		print('Notest')
# 		zero += 1
# 		NoTestPath.append(y)


# print('2tests: ' + str(two))
# print('1test: ' + str(one))
# print('Notest: ' + str(zero))

# print(len(AvailableProPath))
# # print(TwoTestPath)
# print(len(TwoTestPath))
# # print(OneTestPath)
# print(len(OneTestPath))



# num = 0
# filenum = 1
# for Nicadpath in AvailableProPath:
# 	file = open('Nicad_' + str(filenum) + '.java','w') # Nicad_3.javaのファイルを開く
# 	f = open("D:/ryosuke-ku/data_set/maven_190611/" + str(Nicadpath), "r", encoding="utf-8")
# 	lines2 = f.readlines() # 1行毎にファイル終端まで全て読む(改行文字も含まれる)
# 	f.close()

# 	startline = int(startlist[num])-1
# 	endline = int(endlist[num])
# 	num +=1
	
# 	file.write('public class Nicad_' + str(filenum) + '\n')
# 	file.write('{' + '\n')
# 	for x in range(startline,endline):
# 		print(lines2[x].replace('\n', ''))
# 		file.write(lines2[x].replace('\n', '') + '\n')
	
# 	file.write('}')
# 	filenum += 1




# production = open(r'C:\Users\ryosuke-ku\Desktop\Path\ProductionCode.txt','r',encoding="utf-8_sig")
# ProductionPath = production.readlines()
# PPath = [Pline.replace('\n', '') for Pline in ProductionPath]

# production.close()
# #print(ProductionPath)

# Test = open(r'C:\Users\ryosuke-ku\Desktop\Path\TestCode.txt','r',encoding="utf-8_sig")
# TestPath = Test.readlines()
# TPath = [Tline.replace('\n', '') for Tline in TestPath]


# # print(alltest)

# Test.close()
# #print(TestPath)

# dic = dict(zip(PPath,TPath))


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
last9path =[]
delKey =[]


# for i in data:
# 	rt_path = []
# 	# print("----------------------------------------------------------------------------------------------------")
# 	# print(i)
# 	fragments = len(data[i])
# 	# print(len(data[i]))
# 	count = 0
# 	# writer.writerow(data[i])
# 	Similarity_key = i[-4:].replace(":","")
# 	# print(Similarity_key)

# 	for j in data[i]:
# 		last9path = j[-9:]
# 		# print(last9path)
# 		if last9path == 'Test.java':
# 			# print('ProductionPath : ' + j)
# 			# print('テストパスです')
# 			delKey.append(i)
# 		else:
# 			try:
# 				path = dic.get(j)
# 			except KeyError:
# 				pass

# 			if path is None:
# 				pass
# 			else:
# 				reusetest.append(path)
# 				rt_path.append(path)
# 				count += 1
# 				# print('ProductionPath : ' + j)
# 				# print(path)
	



# print(Similarity_total)
# print("-")
# print(len(Similarity_total["100%"]))
# print(Similarity_total["100%"])


# print("----------------------------------------------------------------------------------------------------")
# print("＜クローンペア＞")
# print("すべてのクローンペアの数：" + str(nt + pt + at))
# print("テストコードが見つからなかったクローンペアの数：" + str(nt) + " (" + str(round(nt/(nt + pt + at)*100,1)) + "％)")
# print("どちらか片方のコードフラグメントはテストコードを持っているクローンペアの数：" + str(pt)+ " (" + str(round(pt/(nt + pt + at)*100,1)) + "％)")
# print("両方のコードフラグメントがテストコードを持っているクローンペアの数：" + str(at) + " (" + str(round(at/(nt + pt + at)*100,1)) + "％)")
# print("コードフラグメントの合計数："+ str(totalfragments))
# print("他のテストを再利用できそうなフラグメントの数："+ str(notest) + " (" + str(round(notest/totalfragments*100, 1)) + "％)")
# print("----------------------------------------------------------------------------------------------------")


# c_nt = collections.Counter(list_nt)
# print(c_nt)
# print(len(list_nt))

# c_pt = collections.Counter(list_pt)
# print(c_pt)
# print(len(list_pt))

# c_at = collections.Counter(list_at)
# print(c_at)
# print(len(list_at))



# print(len(list_nt)+len(list_at)+len(list_pt))

# for reusetestpath in reusetest:
# 	print(reusetestpath)
# print(len(reusetest))

delKey_unique = list(set(delKey))
# print(delKey_unique)
# print(len(delKey_unique))
# print(len(delKey))
delKey_unique.sort()
# for w in delKey:
# 	print(w)

# print(len(data))
for delKeyname in delKey_unique:
	del data[delKeyname]

# print(len(data))
# print(data)
# print(data.keys())
# for x in numPairslist_unique:
# 	print(x)
# 	data.pop(int(x))

AvaiTestPaths = []
AvaiProductionPaths = []
for i in data:
	# print("----------------------------------------------------------------------------------------------------")
	# print(i)
	fragments = len(data[i])
	Similarity_key = i[-4:].replace(":","")
	# print(Similarity_key)

	for j in data[i]:
		try:
			path = dic.get(j)
		except KeyError:
			pass

		if path is None:
			pass
		else:
			# print('ProductionPath : ' + j)
			AvaiTestPaths.append(path)
			AvaiProductionPaths.append(j)
			# print('TestPath       : ' +path)

# print(AvaiTestPaths)
# print(len(AvaiTestPaths))
# for AvaiTestPath in AvaiTestPaths:
# 	print(AvaiTestPath)
# print(len(AvaiTestPaths))

# for AvaiProductionPath in AvaiProductionPaths:
# 	print(AvaiProductionPath)
# print(len(AvaiProductionPaths))