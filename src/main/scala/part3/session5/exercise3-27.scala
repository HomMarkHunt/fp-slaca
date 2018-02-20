def depth(leaf: Leaf[A]): Int = leaf match {
  case Leaf(l) => 1
  case Branch(left, right) =>
}
