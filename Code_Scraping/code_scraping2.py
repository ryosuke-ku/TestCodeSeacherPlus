import csv
from urllib.request import urlopen
from bs4 import BeautifulSoup

# URLの指定
html = urlopen("file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/utility_functions-blind-clones/utility_functions-blind-clones-0.30-classes-withsource.html")
bsObj = BeautifulSoup(html, "html.parser")

# テーブルを指定
source = bsObj.findAll("pre")


csvFile = open("ranking2.csv", 'wt', newline='', encoding='utf-8')
writer = csv.writer(csvFile)

try:
    for src in source:
        csvRow = []
        for cell in src.findAll('pre'):
            csvRow.append(cell.get_text())
        writer.writerow(csvRow)
finally:
    csvFile.close()