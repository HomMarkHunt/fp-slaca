sealed trait Tree[+A] {
  case class Leaf[A](value: A) extends Tree[A]
  case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

  def size(): Int = this match {
    case Leaf(l) => 1
    case Branch(left, right) => 1 + left.size() + right.size()
  }
}
