import part3.session3.Cons

def init[A](l: List[A]): List[A] = l match {
  case Cons(h, Nil) => h
  case Cons(h, t) => Cons(h, init(t))
}
