package object Week2 {

  def product(a: Int, b: Int): Int = {
    def loop(acc: Int, x: Int): Int = {
      if (x > b) acc else {
        loop(acc * x, x + 1)
      }
    }

    loop(1, a)
  }

  def fact(x: Int):Int = product(1, x)


  def curriedProduct(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1 else {
      f(a) * curriedProduct(f)(a + 1, b)
    }
  }

  def curriedFact(n: Int):Int = curriedProduct(x => x)(1, n)
}
