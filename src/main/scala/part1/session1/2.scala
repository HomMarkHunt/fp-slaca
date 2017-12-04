class Cafe {
  // Paymentオブジェクトを渡す
  def buyCoffee(cc: CreditCard, p: Payments): Coffee = {
    val cup = new Coffee()
    p.charge(cc, cup.price) // 副作用
    cup
  }
}
// Paymentsをinterfaceにしてもテスタビリティーとバルクに対応できない
