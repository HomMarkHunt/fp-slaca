def flatMap[A, B](as: List[A])(f: A => List[B]): List[B] =
  foldRight(as, Nil)((a, b) => append(f(a), b))
