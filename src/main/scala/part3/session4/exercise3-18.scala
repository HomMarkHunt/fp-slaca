import part3.session4.Cons

def map[A, B](as: List[A])(f: A => B): List[B] =
  foldRight(as, Nil)((a, b) => Cons(f(a), b))
