#!/usr/bin/python
# coding: UTF-8
f = open('CalculatorTest.java')
lines2 = f.readlines() # 1行毎にファイル終端まで全て読む(改行文字も含まれる)

f.close()
# lines2: リスト。要素は1行の文字列データ
# for line in lines2:
#     print(line.replace('\n', ''))

startline = 8
endline = 15

for x in range(startline,endline):
    print(lines2[x].replace('\n', ''))


for x in range(16,24):
    print(lines2[x].replace('\n', ''))

# print(lines2[8].replace('\n', ''))
# print(lines2[9].replace('\n', ''))
# print(lines2[10].replace('\n', ''))
# print(lines2[11].replace('\n', ''))
# print(lines2[12].replace('\n', ''))
# print(lines2[13].replace('\n', ''))
# print(lines2[14].replace('\n', ''))