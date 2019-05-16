from bs4 import BeautifulSoup

# テスト用のHTML
html = """
<html>
<head>
<style type="text/css">
body {font-family:Arial}
table {background-color:white; border:0px solid white; width:95%; margin-left:auto; margin-right: auto}
td {background-color:#b0c4de; padding:16px; border:4px solid white}
pre {background-color:white; padding:4px}
</style>
<title>
NiCad Clone Report
</title>
</head>
<body>
<h2>
NiCad Clone Report
</h2>
System: utility
<br>
<br>Granularity: functions-blind
<br>Max difference threshold: 30%
<br>Clone size: 10 - 2500 lines
<br>
<br>Total functions-blind: 218
<br>Clone pairs found: 6
<br>
<br>LCS compares: 425 &nbsp;&nbsp;&nbsp; CPU time: 0 min 0.0 sec
<br>
<br>Number of  classes: 3
<br>
<h3>Clone class 1, 3 fragments, nominal size 13 lines, similarity 71%
</h3>
<table cellpadding=12 border=2 frame="box" width="90%">
<tr><td>
Lines 6 - 19 of systems/utility/devst_devst_awaji_bird/devst_awaji_bird/src/main/java/features/bird/FizzBuzz.java
<pre>
	public String fizzBuzz(int number) {
		if (number &lt;= 0) {
			throw new RuntimeException();
		}
		if (number % 15 == 0) {
			return "FizzBuzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		} else {
			return Integer.toString(number);
		}
	}
</pre>
</td></tr>
<tr><td>
Lines 6 - 20 of systems/utility/devst_devst_awaji_elephant/devst_awaji_elephant/src/main/java/features/elephant/FizzBuzz.java
<pre>
	public String fizzBuzz(int i) {
		if(i &lt;= 0){
			throw new RuntimeException();
		}

		if (i % 15 == 0) {
			return "FizzBuzz";
		} else if (i % 5 == 0) {
			return "Buzz";
		} else if (i % 3 == 0) {
			return "Fizz";
		}

		return String.valueOf(i);
	}
</pre>
</td></tr>
<tr><td>
Lines 4 - 14 of systems/utility/FizzBuzz.java
<pre>
	public static String apply(int num) {
        if (num % 15 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }
</pre>
</td></tr>
</table>
<h3>Clone class 2, 2 fragments, nominal size 12 lines, similarity 75%
</h3>
<table cellpadding=12 border=2 frame="box" width="90%">
<tr><td>
Lines 193 - 213 of systems/utility/devst_devst_awaji_monkey/devst_awaji_monkey/src/main/java/features/monkey/Poker.java
<pre>
	private boolean isThreeOfAKind(Card[] hand) {
		if (hand[0].getLank().equals(hand[1].getLank())
				&amp;&amp; hand[1].getLank().equals(hand[2].getLank())
				&amp;&amp; !hand[2].getLank().equals(hand[3].getLank())
				&amp;&amp; !hand[3].getLank().equals(hand[4].getLank())) {
			return true;
		}
		if (!hand[0].getLank().equals(hand[1].getLank())
				&amp;&amp; hand[1].getLank().equals(hand[2].getLank())
				&amp;&amp; hand[2].getLank().equals(hand[3].getLank())
				&amp;&amp; !hand[3].getLank().equals(hand[4].getLank())) {
			return true;
		}
		if (!hand[0].getLank().equals(hand[1].getLank())
				&amp;&amp; !hand[1].getLank().equals(hand[2].getLank())
				&amp;&amp; hand[2].getLank().equals(hand[3].getLank())
				&amp;&amp; hand[3].getLank().equals(hand[4].getLank())) {
			return true;
		}
		return false;
	}
</pre>
</td></tr>
<tr><td>
Lines 221 - 241 of systems/utility/devst_devst_awaji_monkey/devst_awaji_monkey/src/main/java/features/monkey/Poker.java
<pre>
	private boolean isTwoPair(Card[] hand) {
		if (hand[0].getLank().equals(hand[1].getLank())
				&amp;&amp; !hand[1].getLank().equals(hand[2].getLank())
				&amp;&amp; hand[2].getLank().equals(hand[3].getLank())
				&amp;&amp; !hand[3].getLank().equals(hand[4].getLank())) {
			return true;
		}
		if (hand[0].getLank().equals(hand[1].getLank())
				&amp;&amp; !hand[1].getLank().equals(hand[2].getLank())
				&amp;&amp; !hand[2].getLank().equals(hand[3].getLank())
				&amp;&amp; hand[3].getLank().equals(hand[4].getLank())) {
			return true;
		}
		if (!hand[0].getLank().equals(hand[1].getLank())
				&amp;&amp; hand[1].getLank().equals(hand[2].getLank())
				&amp;&amp; !hand[2].getLank().equals(hand[3].getLank())
				&amp;&amp; hand[3].getLank().equals(hand[4].getLank())) {
			return true;
		}
		return false;
	}
</pre>
</td></tr>
</table>
<h3>Clone class 3, 3 fragments, nominal size 10 lines, similarity 80%
</h3>
<table cellpadding=12 border=2 frame="box" width="90%">
<tr><td>
Lines 181 - 191 of systems/utility/devst_devst_awaji_monkey/devst_awaji_monkey/src/test/java/features/monkey/CoinTest.java
<pre>
	private void assertRuntimeExceptionThrown(int arg) {
		try {
			this.sut.coinUsage(arg);
			fail("例外が投げられなかった。");
		} catch (Exception e) {
			if (!RuntimeException.class.equals(e.getClass())) {
				fail("RuntimeException以外の例外が投げられた。");
			}
			// success.
		}
	}
</pre>
</td></tr>
<tr><td>
Lines 141 - 151 of systems/utility/devst_devst_awaji_monkey/devst_awaji_monkey/src/test/java/features/monkey/RomanConverterTest.java
<pre>
	private void assertRuntimeExceptionThrown(String arg) {
		try {
			this.sut.toArabic(arg);
			fail("例外が投げられなかった。");
		} catch (Exception e) {
			if (!RuntimeException.class.equals(e.getClass())) {
				fail("RuntimeException以外の例外が投げられた。");
			}
			// success.
		}
	}
</pre>
</td></tr>
<tr><td>
Lines 200 - 210 of systems/utility/devst_devst_awaji_monkey/devst_awaji_monkey/src/test/java/features/monkey/PokerTest.java
<pre>
	private void assertRuntimeExceptionThrown(String... cards) {
		try {
			this.sut.poker(cards);
			fail("例外が投げられなかった。");
		} catch (Exception e) {
			if (!RuntimeException.class.equals(e.getClass())) {
				fail("例外" + e.getClass().getName() + "が投げられた。");
			}
			// success.
		}
	}
</pre>
</td></tr>
</table>
</body>
</html>

"""

#
# .textで取得する方法
#
# soup = BeautifulSoup(html) と書いたらWarningが出るため下記コードにする
soup = BeautifulSoup(html, 'lxml')

f = open('Scraping_NiCad.txt','w')

src = soup.select("table > tr > td")
# print(type(src))
for i in src:
    i.find('pre').decompose()
    f.write(i.text.replace('\n',''))
    f.write("\n")
    print(i.text.replace('\n',''))

    


