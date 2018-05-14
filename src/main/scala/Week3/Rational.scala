package Week3

class Rational(val x: Int, val y: Int) {

  val numer: Int = x
  val denom: Int = y

  def +(that: Rational): Rational = new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def -(that: Rational): Rational = new Rational(numer * that.denom - denom * that.numer, denom * that.denom)

  override def toString: String = numer + "/" + denom
}
