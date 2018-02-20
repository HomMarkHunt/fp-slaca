import part3.session4.Cons

def zipWith[A](a: List[A], b: List[A])(f: (A, A) => A): List[A] = a match {
  case (Cons(x, xs), Cons(y, ys)) => Cons(x + y, zipWith(xs, ys)) // うーん。。。
}
