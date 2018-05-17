package Week5.patternmatching


object Test extends App {

  val e1 = Number(3)
  val e2 = Sum(left = Number(4), right = Number(5))
  println(e1.show)
  println(e2.show)
  val e3 = Var("x")
  println(e3.show)
  val e4 = Sum(left = Number(4), right = Var("x"))
  println(e4.show)
  val e5 = Product(e2, e4)
  println(e5.show)
}
