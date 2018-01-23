import part3.session4.Cons

def double2String(l: List[Double]): List[String] =
  foldRight(l, Nil)((a, b) => Cons(a.toString, b))
