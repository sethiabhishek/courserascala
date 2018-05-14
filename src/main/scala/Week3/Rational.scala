package Week3

class Rational(val x: Int, val y: Int) {
  require(y != 0, "denominator should not be zero")
  val numer: Int = x
  val denom: Int = y

  //non default constructor
  def this(x: Int) = this(x, 1)

  def +(that: Rational): Rational = new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def unary_- : Rational = new Rational(-numer, denom)

  def -(that: Rational): Rational = this + -that

  override def toString: String = numer + "/" + denom

  def <(that: Rational): Boolean = numer * that.denom < denom * that.numer

  def max(that: Rational): Rational = if (this < that) that else this
}
