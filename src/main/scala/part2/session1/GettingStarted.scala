object MyModule { // https://dwango.github.io/scala_text/object.html
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  private def formatAbs(x: Int): String = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  /**
    * プロシージャ, 非純粋関数.
    *
    * Unitは副作用のヒント
    */
  def main(args: Array[String]): Unit =
    println(formatAbs(-42))
}
