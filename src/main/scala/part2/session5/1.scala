/**
  * 配列にkeyが含まれているindexを返す.
  * keyがない場合は-1を返す
  * Stringの値にしか使えない単相関数
  */
def findFirst(ss: Array[String], key: String): Int = {
  def loop(n: Int): Int =
    if (n >= ss.length) -1
    else if (ss(n) == key) n
    else loop(n + 1)

  loop(0)
}
