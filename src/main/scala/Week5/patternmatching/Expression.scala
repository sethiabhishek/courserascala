package Week5.patternmatching

trait Expression {
  def show: String = this match {
    case Number(n) => n.toString
    case Var(v) => v.toString
    case Sum(x, y) => "(" + x.show + "+" + y.show + ")"
    case Product(l, r) => "(" + l.show + "*" + r.show + ")"
  }


}
