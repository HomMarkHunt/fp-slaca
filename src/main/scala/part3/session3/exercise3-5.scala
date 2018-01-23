import part3.session1.Cons

def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
  case Cons(h, t) => if f(h) dropWhile(t, f)
  case _ => l
}
