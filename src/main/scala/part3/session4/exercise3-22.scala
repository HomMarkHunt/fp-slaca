import part3.session4.Cons

def merge(a: List[Int], b: List[Int]): List[Int] = a match {
  case (Cons(x, xs), Cons(y, ys)) => Cons(x + y, merge(xs, ys))
}

