class Cafe {

  def buyCoffee(cc: CreditCard): Coffee = {
    val cup = new Coffee()
    cc.charge(cup.price) // 副作用
    cup
  }

}
