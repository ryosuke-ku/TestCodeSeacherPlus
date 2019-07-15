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
res = req.urlopen(url)

# HTMLを解析

soup = BeautifulSoup(res, "html.parser")

data = defaultdict(list)
product_div = soup.find('body')

codearray = []
countarray = []
count = 0
classnumber = 0 

# クローンクラス<h3>の配列を作成し,類似コードが存在するファイルパス<td>を要素として配列に格納する処理
for product in product_div.find_all(['h3', 'td']):
	if product.name == 'h3':
		key = product.text.replace('\n','').replace('\r','')
		classnumber += 1
	if key and product.name == 'td':
		try:
			srccode = product.find('pre')
			print(srccode.string)
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

print(count)
print(classnumber)
# print(len(data.values()))
# print(data.items())