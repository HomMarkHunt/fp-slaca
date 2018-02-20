import part3.session5.Tree

def maximam(tree: Tree[A]): Int = tree match {
  case Leaf(_) => _
  case Branch(left, right) => maximam(left) max maximam(right)
}
