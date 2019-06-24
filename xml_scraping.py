import urllib.request as req
from bs4 import BeautifulSoup as bs4
 
res = req.urlopen("file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/ant_functions-blind-clones/ant_functions-blind-clones-0.30.xml")
#詳しくは省略、上のXMLが返ってくるものと思ってください
 
soup = bs4(res,'lxml-xml')

links = soup.findAll('source')
count = 0
for link in links:
    count+=1
    print("clone pairs:" + str(count))
    print(link.get('file'))

print(len(links))