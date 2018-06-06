package Week6.second

class HigherOrderList[T] {

  def transform[U](list: List[T], f: T => U): List[U] = list match {
    case List() => Nil
    case x :: y => f(x) :: transform(y, f)
  }
}
