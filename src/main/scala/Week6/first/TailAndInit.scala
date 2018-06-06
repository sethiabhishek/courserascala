package Week6.first

class TailAndInit[T] {

  def last(list: List[T]): T = list match {
    case List() => throw new Error("last.not exist")
    case x :: Nil => x
    case y :: z => last(z)
  }

  def init(list: List[T]): List[T] = list match {
    case List() => throw new Error("empty list")
    case x :: Nil => Nil
    case y :: z => y :: init(z)
  }

  def concat(xs: List[T], ys: List[T]): List[T] = xs match {
    case List() => ys
    case x :: y => x :: concat(y, ys)
  }

  def reverse(xs: List[T]): List[T] = xs match {
    case List() => Nil
    case x :: Nil => xs
    case y :: z => reverse(z) ++ List(y)
  }
}
