import part3.session1.Cons

def tail(list: List[+A]): List[+A] = list match {
  case Cons(_, tail) => tail
  case _ => list
}
