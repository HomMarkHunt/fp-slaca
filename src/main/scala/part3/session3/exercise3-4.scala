def drop[A](l: List[A], n: Int): List[A] = n match {
  case 0 => l
  case 1 => tail(l)
  case _ => drop(tail(l), n - 1)
}
