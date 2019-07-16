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

startlist = []
endlist = []
numpathlist =[]
allpathlist = []
NotestPath =[]
numNotestPath =[]
soup = bs4(res,'lxml-xml')
data = defaultdict(list)
filePaths = soup.find('clones')
count = 0
cnt = 1
for filePath in filePaths.find_all(['clone','source']):
	 
	if filePath.name == 'clone':
		count+=1
		key = "clone pairs:" + str(count) + ":"+ filePath.get('similarity')+"%"
		# print(key)
	if key and filePath.name == 'source':
		path = filePath.get('file')
		path = path[8:]
		# startline = filePath.get('startline')
		# endline = filePath.get('endline')
		# startlist.append(startline)
		# endlist.append(endline)
		registerdPath = str(cnt) + ':' + path
		allpathlist.append(path)
		numpathlist.append(registerdPath)
		data[key].append(path)
		cnt+=1
		cutpath = path[-9:]
		if cutpath == 'Test.java':
			pass
		else:
			NotestPath.append(path)
			numNotestPath.append(registerdPath)
			startline = filePath.get('startline')
			endline = filePath.get('endline')
			startlist.append(startline)
			endlist.append(endline)
			# print(cutpath)
	
# print(NotestPath)
# print(numNotestPath)
		# print(startline + ',' + endline)
# print(startlist)
# print('-------------------------------')
# print(endlist) 
# print('-------------------------------')
# print(allpathlist) 
print('startlist:' + str(len(startlist)))
print('endlist:' + str(len(endlist)))
print('allpathlist:' + str(len(allpathlist)))
print('NotestPath:' + str(len(NotestPath)))
# print(data)
# print(len(data))

startlinedic = dict(zip(numNotestPath,startlist))
endlinedic = dict(zip(numNotestPath,endlist))
# startline = startlinedic.get('1:maven/maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java')
# endline = endlinedic.get('1:maven/maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java')
# print(startlist[0])
# print(startline)
# print(endlist[0])
# print(endline)


# c = 0
# for numpath in numpathlist:
# 	startline = startlinedic.get(numpath)
# 	endline = endlinedic.get(numpath)
# 	print(startlist[c])
# 	print(startline)
# 	print(endlist[c])
# 	print(endline)
# 	c+=1

num = 0
for Nicadpath in NotestPath:
	f = open("D:/ryosuke-ku/data_set/maven_190611/" + str(Nicadpath), "r", encoding="utf-8")
	lines2 = f.readlines() # 1行毎にファイル終端まで全て読む(改行文字も含まれる)
	f.close()


	# print('\n')
	startline = int(startlist[num])-1
	endline = int(endlist[num])
	num +=1
	# for x in range(startline,endline):
	# 	print(lines2[x].replace('\n', ''))


production = open(r'C:\Users\ryosuke-ku\Desktop\Path\ProductionCode.txt','r',encoding="utf-8_sig")
ProductionPath = production.readlines()
PPath = [Pline.replace('\n', '') for Pline in ProductionPath]

production.close()
#print(ProductionPath)

Test = open(r'C:\Users\ryosuke-ku\Desktop\Path\TestCode.txt','r',encoding="utf-8_sig")
TestPath = Test.readlines()
TPath = [Tline.replace('\n', '') for Tline in TestPath]


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
last9path =[]
delKey =[]


for i in data:
	rt_path = []
	print("----------------------------------------------------------------------------------------------------")
	print(i)
	fragments = len(data[i])
	# print(len(data[i]))
	count = 0
	# writer.writerow(data[i])
	Similarity_key = i[-4:].replace(":","")
	# print(Similarity_key)

	for j in data[i]:
		last9path = j[-9:]
		print(last9path)
		if last9path == 'Test.java':
			print('ProductionPath : ' + j)
			print('テストパスです')
			delKey.append(i)
		else:
			try:
				path = dic.get(j)
			except KeyError:
				pass

			if path is None:
				pass
			else:
				reusetest.append(path)
				rt_path.append(path)
				count += 1
				print('ProductionPath : ' + j)
				print(path)
	

	# print(count)
	judgment = fragments - count
	if judgment == 2:
		# print("テストコードが見つかりませんでした")
		nt += 1
		list_nt.append(i[-4:].replace(":",""))
	elif judgment == 0:
		# print("すべてのコードフラグメントがテストコードを持っています")
		at += 1
		list_at.append(i[-4:].replace(":",""))

	elif judgment == 1 :
		# print("クローンペアのうち少なくとも一つのコードフラグメントはテストコードを持っています")
		#print("他のテストを再利用できそうなフラグメントの数："+ str(judgment))
		notest += judgment
		pt +=1
		list_pt.append(i[-4:].replace(":",""))
		Similarity_total[Similarity_key].append(rt_path)

		

#	print(len(data[i])*(len(data[i])-1)/2)
	totalpairs += len(data[i])*(len(data[i])-1)/2
	totalfragments += fragments

# print(len(reusetest))
reusetestpath = list(set(reusetest))
# print(len(reusetestpath))

parcent = [k[-4:].replace(":","") for k in data]
# print(parcent)

c = collections.Counter(parcent)

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

print(len(data))
for delKeyname in delKey_unique:
	del data[delKeyname]

# print(len(data))
# print(data)
# print(data.keys())
# for x in numPairslist_unique:
# 	print(x)
# 	data.pop(int(x))

AvaiTestPath = []
for i in data:
	print("----------------------------------------------------------------------------------------------------")
	print(i)
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
			print('ProductionPath : ' + j)
			AvaiTestPath.append(path)
			print('TestPath       : ' +path)

print(AvaiTestPath)
print(len(AvaiTestPath))