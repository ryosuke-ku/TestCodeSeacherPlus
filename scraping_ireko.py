from bs4 import BeautifulSoup
from collections import defaultdict
import urllib.request as req
import re


# テスト用のHTML
url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/utility_functions-blind-clones/utility_functions-blind-clones-0.30-classes-withsource.html"
res = req.urlopen(url)

# HTMLを解析
soup = BeautifulSoup(res, "html.parser")

# 任意のデータを抽出 --- (※1)
f = open('Scraping_NiCad.txt','w')

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
print(data)


    


