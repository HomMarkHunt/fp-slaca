import part3.session1.Cons

def setHead(list: List[+A], head: A): List[+A] = list match {
  case Cons(h, t) => Cons(head, t)
  case _ => ds
}