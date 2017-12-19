/**
  * String以外にも適用した多相関数.
  */
def findFirst[A](as: Array[A], p: A => Boolean): Int = {
  def loop(n: Int): Int =
    if (n >= as.length) -1
    else if (p(as(n))) n // 要素の評価をする関数を受け取る
    else loop(n + 1)

  loop(0)
}


def main(args: Array[String]): Unit = {
  // 無名関数
  findFirst(Array(1, 2, 3), (x: Int) => x == 9)
  // findFirst(Array(1, 2, 3), (x: String) => x == 9) コンパイルエラーにならない、なぜ？

  //
}
