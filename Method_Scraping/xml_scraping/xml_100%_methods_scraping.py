import urllib.request as req
from bs4 import BeautifulSoup as bs4
from collections import defaultdict
import collections
import re
import csv

class rdict(dict):
    def __getitem__(self, key):
        try:
            return super(rdict, self).__getitem__(key)
        except:
            try:
                ret=[]
                for i in self.keys():
                    m= re.match("^"+key+"$",i)
                    if m:ret.append( super(rdict, self).__getitem__(m.group(0)) )
            except:raise(KeyError(key))
        return ret



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
# url = 'file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/calcite_functions-blind-clones/calcite_functions-blind-clones-0.30.xml'
# url = 'file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/kylin_functions-blind-clones/kylin_functions-blind-clones-0.30.xml'
# url ='file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/logging-log4j2_functions-blind-clones/logging-log4j2_functions-blind-clones-0.30.xml'
# url ='file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/beam_functions-blind-clones/beam_functions-blind-clones-0.30.xml'

projectName = 'maven_0726'
# parcent = '90%' 
t ='t1'

res = req.urlopen(url)
#詳しくは省略、上のXMLが返ってくるものと思ってください

startlist = [] #コード片の開始行番号を格納
endlist = [] #コード片の修了行番号を格納
startdic = defaultdict(list) #コード片の開始行番号を格納
enddic = defaultdict(list) #コード片の修了行番号を格納
startdicPath = defaultdict(list) #コード片の開始行番号を格納
enddicPath = defaultdict(list) #コード片の修了行番号を格納

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
		cutFtestpath = path[-9:] #pathの文字列の末尾から９文字を取得 Test.java かどうかを判定に使う
		cutBtestpathnum = path.rfind("/")
		cutBtestpath = path[cutBtestpathnum + 1:]
		# print(cutBtestpath[:4])
		if cutFtestpath == 'Test.java':
			pass
		elif cutBtestpath[:4] == 'Test':
			pass
		else:
			registerdPath = str(num) + ':' + path # 3:apache_ant/ant/src/main/org/apache/tools/ant/AntClassLoader.java 同じファイルパスを区別するため
			NotestPath.append(path)
			numNotestPath.append(registerdPath)
			startline = filePath.get('startline') #コード片の開始行番号を取得
			endline = filePath.get('endline') #コード片の修了行番号を取得
			startlist.append(startline)
			endlist.append(endline)
			startdicPath[registerdPath].append(startline)
			enddicPath[registerdPath].append(endline)
			startdic[key].append(startline)
			enddic[key].append(endline)
			delTestdata[key].append(path)
			numdelTestdata[key].append(registerdPath)
			num += 1





production = open(r'C:\Users\ryosuke-ku\Desktop\Path\newProductionPath.txt','r',encoding="utf-8_sig")
ProductionPath = production.readlines()
PPath = [Pline.replace('\n', '') for Pline in ProductionPath]
production.close()

Test = open(r'C:\Users\ryosuke-ku\Desktop\Path\newTestPath.txt','r',encoding="utf-8_sig")
TestPath = Test.readlines()
TPath = [Tline.replace('\n', '') for Tline in TestPath]
Test.close()


dic = dict(zip(PPath,TPath))




delPairs = []
for t in numdelTestdata:
	for h in numdelTestdata[t]:
		if len(numdelTestdata[t]) != 2: # クローンペアが２つのコード片からならないものを取得する
			delPairs.append(t)
	

for pairs in delPairs:
	startkey = numdelTestdata[pairs]
	startdicPath.pop(startkey[0]) # プロダクションコード片とテストコード片からなるクローンペアのプロダクションコードの開始行を削除
	endkey = numdelTestdata[pairs]
	enddicPath.pop(endkey[0]) # プロダクションコード片とテストコード片からなるクローンペアのプロダクションコードの修了行を削除
	# print(numdelTestdata[pairs])
	numdelTestdata.pop(pairs)



# print(numdelTestdata)
# print(len(numdelTestdata))

# print(numdelTestdata)
# print(len(numdelTestdata))
data3 = defaultdict(list)
rd = rdict(numdelTestdata)
# similarity = '100%'
for i in numdelTestdata:
	similarity = i[i.rfind(":")+1:]
	# print(similarity)
	# if similarity == '96%' or similarity == '97%' or similarity == '98%' or similarity == '99%' or similarity == '100%': # or similarity == '96%' or similarity == '97%' or similarity == '98%' or similarity == '99%' or similarity == '100%':
	data3[i].append(numdelTestdata[i])
	
	# data3[i].append(rd["^(?=.*100%).*$"])

# print(len(data3))
# print(data3)


data2 = defaultdict(list)
onlyhasTestdata = defaultdict(list)
onlyhasTestPdata = defaultdict(list)

# for i in numdelTestdata:
# 	for j in numdelTestdata[i]:
# 		delnum = re.sub(r".*?:", "", j)
# 		path = dic.get(delnum)
# 		data2[i].append(path)
# 		if path is not None:
# 			onlyhasTestdata[i].append(path)
# 			onlyhasTestPdata[i].append(j)


only100list = defaultdict(list)
for k in data3:
	for l in data3[k][0]:
		dnum = re.sub(r".*?:", "", l)
		p = dic.get(dnum)
		only100list[k].append(p)
		if p is not None:
			onlyhasTestdata[k].append(p)
			onlyhasTestPdata[k].append(l)

# print(onlyhasTestPdata)
print(len(onlyhasTestdata))

def OutputNicadt1File():
	t1 = 0
	t1keylist = []
	for h in onlyhasTestPdata:
		if len(onlyhasTestPdata[h]) == 1:
			t1keylist.append(h)
			t1 += 1

	t1mapdic = defaultdict(list)
	t1mapTestcodedic = defaultdict(list)
	for u in t1keylist:
		path = onlyhasTestPdata[u]
		t1mapdic[u].append(path)
		testpath = onlyhasTestdata[u]
		t1mapTestcodedic[u].append(testpath)

	# print(t1mapTestcodedic)
	print(len(t1mapTestcodedic))


	Slinelist =[]
	Elinelist =[]
	for k in t1mapdic:
		for g in t1mapdic[k]:
			# print(g[0])
			Sline = startdicPath[g[0]]
			Slinelist.append(Sline)
			Eline = enddicPath[g[0]]
			Elinelist.append(Eline)


	num = 0
	filenum = 1
	for k in t1mapdic:
		# print(k)
		path = t1mapdic[k][0][0]
		# print(path)
		editpath = re.sub(r".*?:", "", path)
		# print(editpath)
		
		file = open('NicadOutputFile_t1_' + projectName + '/Nicad_t1_' + projectName + str(filenum) + '.java','w') # Nicad_3.javaのファイルを開く
		f = open("C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/" + editpath, "r", encoding="utf-8")
		lines2 = f.readlines() # 1行毎にファイル終端まで全て読む(改行文字も含まれる)
		f.close()


		startline = int(Slinelist[num][0])-1
		endline = int(Elinelist[num][0])
		num +=1
		file.write("//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/" + editpath + "\n")
		file.write('// ' + k + '\n')
		file.write('// ' + path + '\n')
		file.write('\n')
		file.write('public class Nicad_t1_' + projectName + str(filenum) + '\n')
		file.write('{' + '\n')
		for x in range(startline,endline):
			print(lines2[x].replace('\n', ''))
			file.write(lines2[x].replace('\n', '') + '\n')
		
		file.write('}')
		filenum += 1

	TestPathfile = open('TestPath_t1_' + projectName + '.txt','w') # Nicad_3.javaのファイルを開く

	for s in t1mapTestcodedic:
		TestPathfile.write(t1mapTestcodedic[s][0][0] + '\n')

OutputNicadt1File()


def OutputNicadt2File():
	t2 = 0
	t2keylist = []
	for h in onlyhasTestPdata:
		if len(onlyhasTestPdata[h]) == 2:
			t2keylist.append(h)
			t2 += 1

	t2mapdic = defaultdict(list)
	t2mapTestcodedic = defaultdict(list)
	for u in t2keylist:
		path = onlyhasTestPdata[u]
		t2mapdic[u].append(path)
		testpath = onlyhasTestdata[u]
		t2mapTestcodedic[u].append(testpath)

	# print(t1mapTestcodedic)
	print(len(t2mapTestcodedic))


	Slinelist =[]
	Elinelist =[]
	for k in t2mapdic:
		for g in t2mapdic[k]:
			# print(g[0])
			Sline = startdicPath[g[0]]
			Slinelist.append(Sline)
			Eline = enddicPath[g[0]]
			Elinelist.append(Eline)


	num = 0
	filenum = 1
	for k in t2mapdic:
		# print(k)
		path = t2mapdic[k][0][0]
		# print(path)
		editpath = re.sub(r".*?:", "", path)
		# print(editpath)
		
		file = open('NicadOutputFile_t2_' + projectName + '/Nicad_t2_' + projectName + str(filenum) + '.java','w') # Nicad_3.javaのファイルを開く
		f = open("C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/" + editpath, "r", encoding="utf-8")
		lines2 = f.readlines() # 1行毎にファイル終端まで全て読む(改行文字も含まれる)
		f.close()


		startline = int(Slinelist[num][0])-1
		endline = int(Elinelist[num][0])
		num +=1

		file.write('// ' + k + '\n')
		file.write('// ' + path + '\n')
		file.write('\n')
		file.write('public class Nicad_t2_' + projectName + str(filenum) + '\n')
		file.write('{' + '\n')
		for x in range(startline,endline):
			try:
				print(lines2[x].replace('\n', ''))
				file.write(lines2[x].replace('\n', '') + '\n')
			except UnicodeEncodeError:
				pass
		file.write('}')
		filenum += 1

	TestPathfile = open('TestPath_t2_' + projectName + '.txt','w') # Nicad_3.javaのファイルを開く

	for s in t2mapTestcodedic:
		TestPathfile.write(t2mapTestcodedic[s][0][0] + '\n')

# OutputNicadt2File()


def ClassifyClonePairs():
	# print(data2)
	print(len(data2))
	p = 0
	q = 0
	r = 0
	for k in data2:
		n = 0
		for j in data2[k]:
			print(j)
			if j is not None:
				n += 1
		if n == 0:
			p += 1
		if n == 1:
			q += 1
		if n == 2:
			r += 1

	print('テストコードが見つからないクローンペア : ' + str(p) + '(' + str(round(p/(p+q+r)*100,1)) + ')')
	print('どちらか片方のコードフラグメントにテストコードが存在する : ' + str(q) + '(' + str(round(q/(p+q+r)*100,1)) + ')')
	print('両方のコードフラグメントにテストコードが存在するクローンペア : ' + str(r) + '(' + str(round(r/(p+q+r)*100,1)) + ')')
	print('合計 : '+ str(p+q+r))


# ClassifyClonePairs()

def Classify100ClonePairs():
	# print(data2)
	# print(len(only100list))
	p = 0
	q = 0
	r = 0
	for k in only100list:
		n = 0
		for j in only100list[k]:
			# print(j)
			if j is not None:
				n += 1
		if n == 0:
			p += 1
		if n == 1:
			q += 1
		if n == 2:
			r += 1

	print('テストコードが見つからないクローンペア : ' + str(p) + '(' + str(round(p/(p+q+r)*100,1)) + ')')
	print('どちらか片方のコードフラグメントにテストコードが存在する : ' + str(q) + '(' + str(round(q/(p+q+r)*100,1)) + ')')
	print('両方のコードフラグメントにテストコードが存在するクローンペア : ' + str(r) + '(' + str(round(r/(p+q+r)*100,1)) + ')')
	print('合計 : '+ str(p+q+r))

Classify100ClonePairs()