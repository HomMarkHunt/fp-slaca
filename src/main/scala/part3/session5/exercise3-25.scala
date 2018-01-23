sealed trait Tree[+A]
case class Leaf[A](value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

def size(): Int = {
  if (isInstanceOf[Leaf[A]]) {
    1
  } else if (isInstanceOf[Branch[A]]) {
    val branch = asInstanceOf[Branch[A]]
    1 + branch.left.size + branch.right.size
  } else {
    throw new IllegalStateException
  }
}
