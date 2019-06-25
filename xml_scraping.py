import urllib.request as req
from bs4 import BeautifulSoup as bs4
from collections import defaultdict

# url ="file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven_functions-blind-clones/maven_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/hadoop_functions-blind-clones/hadoop_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/ant_functions-blind-clones/ant_functions-blind-clones-0.30.xml"
# url ="file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/cassandra_functions-blind-clones/cassandra_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/httpcomponents-client_functions-blind-clones/httpcomponents-client_functions-blind-clones-0.30.xml"
url ="file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/flink_functions-blind-clones/flink_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/kafka_functions-blind-clones/kafka_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/elasticsearch_functions-blind-clones/elasticsearch_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/jacoco_functions-blind-clones/jacoco_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/JCSprout_functions-blind-clones/JCSprout_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/jetty.project_functions-blind-clones/jetty.project_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/retrofit_functions-blind-clones/retrofit_functions-blind-clones-0.30.xml"
# url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/RxJava_functions-blind-clones/RxJava_functions-blind-clones-0.30.xml"

res = req.urlopen(url)
#詳しくは省略、上のXMLが返ってくるものと思ってください


soup = bs4(res,'lxml-xml')
data = defaultdict(list)
filePaths = soup.find('clones')
count = 0
for filePath in filePaths.find_all(['clone','source']):
     
    if filePath.name == 'clone':
        count+=1
        key = "clone pairs:" + str(count) + ":"+ filePath.get('similarity')+"%"
        # print(key)
    if key and filePath.name == 'source':
        path = filePath.get('file')
        path = path[8:]
        data[key].append(path)
    
# print(data)
# print(len(data))

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

for i in data:
	rt_path = []
	print("----------------------------------------------------------------------------------------------------")
	print(i)
	fragments = len(data[i])
	print(len(data[i]))
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

	# print(count)
	judgment = fragments - count
	if judgment == 2:
		print("テストコードが見つかりませんでした")
		nt += 1
		list_nt.append(i[-4:].replace(" ",""))
	elif judgment == 0:
		print("すべてのコードフラグメントがテストコードを持っています")
		at += 1
		list_at.append(i[-4:].replace(":",""))

	elif judgment == 1 :
		print("クローンペアのうち少なくとも一つのコードフラグメントはテストコードを持っています")
		#print("他のテストを再利用できそうなフラグメントの数："+ str(judgment))
		notest += judgment
		pt +=1
		list_pt.append(i[-4:].replace(" ",""))
		Similarity_total[Similarity_key].append(rt_path)

		

#	print(len(data[i])*(len(data[i])-1)/2)
	totalpairs += len(data[i])*(len(data[i])-1)/2
	totalfragments += fragments

# print(len(reusetest))
reusetestpath = list(set(reusetest))
# print(len(reusetestpath))

parcent = [k[-4:].replace(":","") for k in data]
# print(parcent)



print(Similarity_total)
print("-")
print(len(Similarity_total["100%"]))
# print(Similarity_total["100%"])


print("----------------------------------------------------------------------------------------------------")
print("＜クローンクラス＞")
print("すべてのクローンペアの数：" + str(nt + pt + at))
print("テストコードが見つからなかったクローンペアの数：" + str(nt) + " (" + str(round(nt/(nt + pt + at)*100,1)) + "％)")
print("どちらか片方のコードフラグメントはテストコードを持っているクローンペアの数：" + str(pt)+ " (" + str(round(pt/(nt + pt + at)*100,1)) + "％)")
print("両方のコードフラグメントがテストコードを持っているクローンペアの数：" + str(at) + " (" + str(round(at/(nt + pt + at)*100,1)) + "％)")
print("----------------------------------------------------------------------------------------------------")
print("＜クローンペア＞")
print("クローンペアの合計数："+ str(round(totalpairs)))
print("コードフラグメントの合計数："+ str(totalfragments))
print("他のテストを再利用できそうなフラグメントの数："+ str(notest) + " (" + str(round(notest/totalfragments*100, 1)) + "％)")
print("----------------------------------------------------------------------------------------------------")
