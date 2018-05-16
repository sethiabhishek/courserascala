package Week4

object Test extends App {

  val node1 = new NonEmpty(3, new Empty, new Empty)
  val node2 = node1 incl 4

  println("node1 is:" + node1)
  println("node2 is:" + node2)

}
