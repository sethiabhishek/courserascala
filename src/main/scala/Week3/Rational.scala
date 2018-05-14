package Week3

class Rational(val x: Int, val y: Int) {

  val numer: Int = x
  val denom: Int = y

  def add(that: Rational): Rational = new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational): Rational = add(that.neg)

  override def toString: String = numer + "/" + denom
}
