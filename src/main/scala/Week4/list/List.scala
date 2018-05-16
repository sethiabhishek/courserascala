package Week4.list

abstract class List[T] {
  def isEmpty: Boolean

  def head: T

  def tail: List[T]
}

class Nil[T] extends List[T] {
  override def isEmpty: Boolean = true

  override def head: Nothing = throw new IllegalAccessException

  override def tail: Nothing = throw new IllegalAccessException

  override def toString: String = "Nil"
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  override def isEmpty: Boolean = false

  override def toString: String = head + "->" + tail.toString
}