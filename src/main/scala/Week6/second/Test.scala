package Week6.second

object Test {
  def main(args: Array[String]): Unit = {
    val list = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
    val f = (x: Int) => 2 * x
    val higherOrderList = new HigherOrderList[Int]()
    val resultantList = higherOrderList.transform(list, f)
    println(resultantList)
  }
}
