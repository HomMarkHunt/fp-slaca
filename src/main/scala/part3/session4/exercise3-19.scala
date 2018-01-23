import part3.session4.Cons

def filter[A](as: List[A])(f: A => Boolean): List[A] =
  foldRight(as, Nil)((a, b) => if (f(a)) Cons(a, b) else Cons(Nil, b))
