import part3.session4.Cons

def plusOne(l: List[Int]): List[Int] =
  foldRight(l, Nil)((a, b) => Cons(a + 1, Cons(b)))
