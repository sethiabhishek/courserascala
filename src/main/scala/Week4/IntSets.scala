package Week4

abstract class IntSets {
  def incl(x: Int): IntSets

  def contains(x: Int): Boolean
}

class Empty extends IntSets {
  def incl(x: Int): IntSets = new NonEmpty(x, new Empty, new Empty)

  def contains(x: Int): Boolean = false

  override def toString: String = "."
}

class NonEmpty(element: Int, left: IntSets, right: IntSets) extends IntSets {
  override def incl(x: Int): IntSets = {
    if (element > x) new NonEmpty(element, left incl x, right) else if (x > element) new NonEmpty(element, left, right incl x) else this
  }

  override def contains(x: Int): Boolean = {
    if (element == x) true else {
      if (element < x) right contains x else left contains x
    }
  }

  override def toString: String = "{" + left + element + right + "}"
}
