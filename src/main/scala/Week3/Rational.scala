package Week3

class Rational(val x: Int, val y: Int) {
  require(y != 0, "denominator should not be zero")
  val numer: Int = x
  val denom: Int = y

  def add(that: Rational): Rational = new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational): Rational = add(that.neg)

  override def toString: String = numer + "/" + denom

  def less(that: Rational): Boolean = numer * that.denom < denom * that.numer

  def max(that: Rational): Rational = if (this.less(that)) that else this
}
