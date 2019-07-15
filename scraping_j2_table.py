import csv
from urllib.request import urlopen
from bs4 import BeautifulSoup

# URLの指定
html = urlopen("file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/apache_ant_functions-blind-clones/apache_ant_functions-blind-clones-0.30-classes-withsource.html")
bsObj = BeautifulSoup(html, "html.parser")

# テーブルを指定
table = bsObj.findAll("table")[0]
table = bsObj.findAll("table")[1]
rows = table.findAll("tr")

csvFile = open("ranking.csv", 'wt', newline='', encoding='utf-8')
writer = csv.writer(csvFile)

try:
    for row in rows:
        csvRow = []
        for cell in row.findAll(['td', 'pre']):
            csvRow.append(cell.get_text())
        writer.writerow(csvRow)
finally:
    csvFile.close()