import part3.session1
import part3.session1.List

class cafe {
  def buyCoffee(cc: CreditCard): (Coffee, Charge) = {
    val cup = new Coffee()
    (cup, cup.price) // charge作成を切り離す
  }

  def buyCoffees(cc: CreditCard, n: Int): (List[Coffee], Charge) = {
    val purchases: List[(Coffee, Charge)] = session1.List.fill(n)(buyCoffee(cc)) // List.fill(n)(x)よくわからん, xのコピーをn個含んだListを作成する
    val (coffees, charges) = purchases.unzip // unzipでpairを分解
      (coffees, charges.reduce((c1, c2) => c1.combine(c2)))
  }
}
