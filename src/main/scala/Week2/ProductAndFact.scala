package Week2

object ProductAndFact extends App {
  val prd = product(1, 10)
  println(prd)

  //print out factorial for 2,4,5
  println(fact(2))
  println(fact(4))
  println(fact(5))
  println(fact(6))

  // curried versions
  println("curried product")
  println(curriedProduct(x => x * x)(1, 3))

  println("curried factorials")
  println(curriedFact(5))

  //generalised product via currying
  val gProduct = mapReduceProduct(x => x * x)(1, 3)

  println(gProduct)


}
