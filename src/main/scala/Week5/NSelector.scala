package Week5

import Week4.list.List

object NSelector {

  def nth[T](n: Int, list: List[T]): T = {
    if (n < 0 || (n > 0 && list.isEmpty)) throw new IndexOutOfBoundsException
    if (n == 1) list.head else nth(n - 1, list.tail)
  }
}
