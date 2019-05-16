from bs4 import BeautifulSoup
import urllib.request as req

# HTMLを取得
url = "file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/utility_functions-blind-clones/utility_functions-blind-clones-0.30-classes-withsource.html"
res = req.urlopen(url)

# HTMLを解析
soup = BeautifulSoup(res, "html.parser")

# 任意のデータを抽出 --- (※1)
f = open('Scraping_NiCad.txt','w')

src = soup.select("table > tr > td > pre")
for s in src:
    # if ".java" in s.string:
        f.write(s.string)
        f.write("\n")
        print(s.string)