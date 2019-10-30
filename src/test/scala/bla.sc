import scala.util.{Failure, Success, Try}

def ble = Solution.factorial(4)
ble.equals(1)

List(1, 2, 3, 4)

for {
  a <- 1 to 10
  b <- 10 to 20
} yield {
  (a, b)
}


for {
  a <- 1 to 10
  b <- 10 to 20
} yield {
  a + b
}

def divide: Try[Int] = {
  val dividend = Try(Console.readLine("Enter an Int that you'd like to divide:\n").toInt)
  val divisor = Try(Console.readLine("Enter an Int that you'd like to divide by:\n").toInt)
  val problem = dividend.flatMap(x => divisor.map(y => x/y))
  problem match {
    case Success(v) =>
      println("Result of " + dividend.get + "/"+ divisor.get +" is: " + v)
      Success(v)
    case Failure(e) =>
      println("You must've divided by zero or entered something that's not an Int. Try again!")
      println("Info from the exception: " + e.getMessage)
      divide
  }
}

divide








