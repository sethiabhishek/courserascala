package Week5.naturalnumber

abstract class NaturalNumber {
  def isZero: Boolean

  def predecessor: NaturalNumber

  def successor: NaturalNumber

  def +(that: NaturalNumber): NaturalNumber

  def -(that: NaturalNumber): NaturalNumber
}

object Zero extends NaturalNumber {
  override def isZero: Boolean = true

  override def predecessor: Nothing = throw new NoSuchElementException

  override def successor: NaturalNumber = new Succ(this)

  override def +(that: NaturalNumber): NaturalNumber = that

  override def -(that: NaturalNumber): NaturalNumber = if (that.isZero) Zero else throw new Error("0.-ve operation")
}

class Succ(val predecessor: NaturalNumber) extends NaturalNumber {
  override def isZero: Boolean = false

  override def successor: NaturalNumber = new Succ(this)

  override def +(that: NaturalNumber): NaturalNumber = new Succ(predecessor + that)

  override def -(that: NaturalNumber): NaturalNumber = if (that.isZero) this else predecessor - that.predecessor
}
