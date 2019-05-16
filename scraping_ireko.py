from bs4 import BeautifulSoup
from collections import defaultdict


# テスト用のHTML
html = """
<html>
<head>
<style type="text/css">
body {font-family:Arial}
table {background-color:white; border:0px solid white; width:95%; margin-left:auto; margin-right: auto}
td {background-color:#b0c4de; patding:16px; border:4px solid white}
pre {background-color:white; patding:4px}
</style>
<title>
NiCad Clone Report
</title>
</head>
<body>
<div class="products">	
<dl>
<h3>車</h3>		
<td>レクサス<pre>トヨタ</pre></td>		
<td>クラウン<pre>トヨタ</pre></td>
<h3>バイク</h3>		
<td>ホンダ</td>
<td>トヨタ</td>
<td>ヤマハ
<pre>静岡</pre></td>
</dl>
</div>
</body>
</html>

"""

#
# .textで取得する方法
#
# soup = BeautifulSoup(html) と書いたらWarningが出るため下記コードにする
soup = BeautifulSoup(html, 'lxml')

f = open('Scraping_NiCad.txt','w')


data = defaultdict(list)
product_div = soup.find('body')

# code = soup.find('pre').extract()

for product in product_div.find_all(['h3', 'td']):
	if product.name == 'h3':
		key = product.text
	if key and product.name == 'td':
		try:
			product.find('pre').decompose()
		except AttributeError:
			pass
		data[key].append(product.text.replace('\n',''))

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

    


