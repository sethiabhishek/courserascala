package Week3

object Main extends App {

  val x = new Rational(1, 3)
  println(x)
  val y = new Rational(5, 7)
  println(y)
  val z = new Rational(3, 2)
  println(z)

  val result: Rational = x - y - z

  println(result)

  println(x < y)
  println(x max y)

  // creating a rational number with denominator 0
  val strange = new Rational(2)
  println(strange)


}
