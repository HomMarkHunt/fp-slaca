## 関数とはいったい何か

* 関数型プログラミング -> 純粋関数 -> 副作用を持たない関数
* 入力値A, 出力値B
  * A型の値全てをBに関連付ける、BはAの値によって決まる状態
  * A => B

```scala:例
// Int => String
def intToString(i: Int): String = {
  i.toString
}
```
 
### 参照透過性
 
* **どのようなプログラムにおいてもプログラムの意味を変えることなく。式をその結果に置き換えることができる**
* `intToString(5)` の結果を呼び出し元において`"5"`と置き換えても正しく動作する。てきな？
