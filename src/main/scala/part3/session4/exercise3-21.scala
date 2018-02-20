def filter[A](as: List[A])(f: A => Boolean): List[A] =
  flatMap(as)(n => if (f(n)) List(n) else Nil)

def flatMap[A, B](as: List[A])(f: A => List[B]): List[B] =
  foldRight(as, Nil)((a, b) => append(f(a), b))

