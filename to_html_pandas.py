import pandas as pd

df = pd.read_csv('ranking.csv')

df = df.dropna(axis=1, how='any')

# <th>内の文字列を真ん中に寄せる
pd.set_option('colheader_justify', 'center')

html_string = '''
<html>
  <head><meta charset="UTF-8">
  <title>J2 Ranking</title>
  </head>
  <link rel="stylesheet" type="text/css" href="mystyle.css"/>
  <body>
    {table}
  </body>
</html>
'''

# OUTPUT AN HTML FILE
with open('ranking.html', 'w') as f:
    f.write(html_string.format(table=df.to_html(classes='mystyle', index=False)))