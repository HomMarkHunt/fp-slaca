package part4.session1

class Option {

  def failingFn(i: Int): Int = {
    val y: Int = throw new Exception("failed!!") // yは参照透過ではない
    try {
      val x = 42 + 5
      x + y
    }
    catch { case e: Exception => 43}
  }

  def failingFn2(i: Int): Int = {
    try {
      val x = 42 + 5
      x + ((throw new Exception("failed!!")): Int)
    }
    catch { case e: Exception => 43}
  }

}
