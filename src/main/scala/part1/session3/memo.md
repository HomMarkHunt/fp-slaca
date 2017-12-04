## 参照透過性、純粋性、置換モデル

* 参照透過性はこれでいうとどういうこと？

```scala
def buyCoffee(cc: CreditCard): Coffee = {
  val cup = new Coffee()
  cc.charge(cup.price) // 副作用
  cup
}
```

* chargeはUnit
  * buyCoffeeの戻りは`new Coffee()`と同等
  * つまり、buyCoffeeの呼び出し元を全て`new Coffee()`と置き換えても、正しく動作(影響を与えない)しなければならない
  * この条件が満たされないので上記buyCoffeeには参照透過性がない。といえる

### 置換モデル

* 参照透過性では、**関数が実行する全てのことが戻り値によって表される** <= 普遍条件！ 
* 関数を全て結果に置き換えても同じように計算が進められる。
  * 等価による置換
  * プログラムの等式推論がなりたつ(意味不明)
  
### 純粋性

* 参照透過性が担保されるとめっちゃモジュール性高い
  * 合成可能
* 