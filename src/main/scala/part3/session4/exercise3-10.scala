@annotation.tailrec
def foldLeft[A, B](as: List[A], z: B)(f: (B, A) => B): B =
  
