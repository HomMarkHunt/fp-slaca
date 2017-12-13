def fib(n: Int): Int = {
  def calc(n: Int, first: Int = 0, second: Int = 1): Int =
    if (n <= 2) first + second
    else calc(n - 1, second, first + second)
  calc(n)
}
