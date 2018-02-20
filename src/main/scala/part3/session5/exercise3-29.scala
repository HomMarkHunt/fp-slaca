def fold[A, B](tree: Tree[A])(f: A => B)(g: (B, B) => B): B = tree match {
  case Leaf(v) => f(v)
  case Branch(left, right) => g(fold(left)(f)(g), fold(right)(f)(g))
}
