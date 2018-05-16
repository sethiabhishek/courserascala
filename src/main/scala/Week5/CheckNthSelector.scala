package Week5

import Week4.list.{Cons, Nil}


object CheckNthSelector extends App {
  val first = new Cons[Int](3, new Cons[Int](4, new Cons[Int](5, new Nil)))
  val nthValue = NSelector.nth(3, first)
  val secVal = NSelector.nth(4, first)
  val anotherVal = NSelector.nth(-4, first)
  println(nthValue)
}
