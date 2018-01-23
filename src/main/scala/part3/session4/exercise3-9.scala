import part3.session4.List

def length[A](as: List[A]): Int =
  foldRight(as, 0)((_, tail) => tail + 1)
