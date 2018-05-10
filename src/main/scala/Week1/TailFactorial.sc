package Week1
object TailFactorial{

  def tailFactorial(x:Int):Int = {
    def factorial(acc:Int,fact:Int):Int = {
      if(fact == 1) acc
      else{
        factorial(acc*fact,fact-1)
      }
    }
    factorial(1,x)
  }

  tailFactorial(2)
  tailFactorial(5)

}