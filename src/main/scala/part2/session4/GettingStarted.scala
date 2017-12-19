object MyModule {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int = // ローカル関数 kotlinと一緒
      if (n <= 0) acc
      else go(n-1, n*acc)

    go(mn, 1)
  }

  private def formatAbs(x: Int): String = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  private def firmatFactorial(n: Int) = {
    val msg = "The factorial of %d is %d"
    msg.format(n, factorial(n))
  }

  /**
    * 高階関数.
    * formatAbsとfirmatFactorialの数値判定を引数として受け取って共通化
    *
    * @param f Intを受け取ってIntを返す関数
    */
  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d"
    msg.format(name, n, f(n))
  }

  def main(args: Array[String]): Unit =
    println(formatAbs(-42))
}
