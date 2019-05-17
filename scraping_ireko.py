from bs4 import BeautifulSoup
from collections import defaultdict
import urllib.request as req
import re


# テスト用のHTML
url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/utility_functions-blind-clones/utility_functions-blind-clones-0.30-classes-withsource.html"
res = req.urlopen(url)

#
# .textで取得する方法
#
# soup = BeautifulSoup(html) と書いたらWarningが出るため下記コードにする
# HTMLを解析
soup = BeautifulSoup(res, "html.parser")

f = open('Scraping_NiCad.txt','w')


data = defaultdict(list)
product_div = soup.find('body')

# code = soup.find('pre').extract()

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
		# path = product.text.replace('\n','').replace('\r','')
		path = product.text
		path = product.text.replace('\n','').replace('\r','')
		edit_path = re.sub(r"Lines.*?systems/", "", path)
		edit_path2 = re.sub(r"\n", "", edit_path)
	
		data[key].append(edit_path)
		f.write(edit_path)
		f.write("\n")
print(data)
# src = soup.select("table > tr > td")
# # print(type(src))
# for i in src:
#     i.find('pre').decompose()
#     f.write(i.text.replace('\n',''))
#     f.write("\n")
#     print(i.text.replace('\n',''))

# cclass = soup.select("body > h3")

# for t in cclass:
#     # if ".java" in s.string:
#         f.write(t.string)
#         f.write("\n")
#         print(t.string.replace('\n',''))

    


