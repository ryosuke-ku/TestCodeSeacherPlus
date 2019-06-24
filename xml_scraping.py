import urllib.request as req
from bs4 import BeautifulSoup as bs4
from collections import defaultdict
 
# res = req.urlopen("file:///C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/ant_functions-blind-clones/ant_functions-blind-clones-0.30.xml")
#詳しくは省略、上のXMLが返ってくるものと思ってください


res = """
<clones>
<systeminfo processor="nicad5" system="ant" granularity="functions" threshold="0%" minlines="10" maxlines="2500"/>
<cloneinfo npcs="14605" npairs="27"/>
<runinfo ncompares="175943" cputime="140"/>

<clone nlines="34" similarity="100">
<source file="systems/ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java" startline="586" endline="624" pcid="5606"></source>
<source file="systems/ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTPTaskMirrorImpl.java" startline="478" endline="514" pcid="5812"></source>
</clone>

<clone nlines="34" similarity="100">
<source file="systems/ant/src/main/org/apache/tools/ant/types/optional/imageio/ColorMapper.java" startline="69" endline="102" pcid="8323"></source>
<source file="systems/ant/src/main/org/apache/tools/ant/types/optional/image/ColorMapper.java" startline="69" endline="102" pcid="8266"></source>
</clone>

<clone nlines="30" similarity="100">
<source file="systems/ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTPTask.java" startline="736" endline="774" pcid="5779"></source>
<source file="systems/ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java" startline="1702" endline="1740" pcid="5680"></source>
</clone>

<clone nlines="28" similarity="100">
<source file="systems/ant/src/tutorial/tasks-filesets-properties/04-lists/src/Find.java" startline="62" endline="94" pcid="14571"></source>
<source file="systems/ant/src/tutorial/tasks-filesets-properties/final/src/Find.java" startline="64" endline="99" pcid="14584"></source>
</clone>

</clones>
"""

soup = bs4(res,'lxml-xml')
data = defaultdict(list)
filePaths = soup.find('clones')
count = 0
for filePath in filePaths.find_all(['clone','source']):
    count+=1  
    if filePath.name == 'clone':
        key = "clone pairs:" + str(count) + ":"+ filePath.get('similarity')
        print(key)
    if key and filePath.name == 'source':
        data[key].append(filePath.get('file'))
    

 
    # print("clone pairs:" + str(count))
    # print(filePath.get('file'))

print(data)
print(len(filePaths))