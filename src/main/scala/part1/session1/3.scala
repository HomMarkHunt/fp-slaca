// 関数型ソリューション
class Cafe {
  def buyCoffee(cc: CreditCard): (Coffee, Charge) = {
    val cup = new Coffee()
    (cup, cup.price) // charge作成を切り離す
  }
}

/**
  * CreditCardとAmountを持つ.
  * 他のChargeをまとめるconbineをもつ.
  *
  * @param cc
  * @param amount
  */
case class Charge(cc: CreditCard, amount: Double) {
  def combine(other: Charge): Charge =
    if (cc == other.cc)
      Charge(cc, amount + other.amount) // 他のchargeをまとめる
    else
      throw new Exception("Otherチャージがないよ")
}
