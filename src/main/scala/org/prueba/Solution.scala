import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {


  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt
    var numbers = new Array[Double](n)

    for (nItr <- 1 to n) {
      val x = stdin.readLine.trim.toDouble
      numbers(nItr - 1) = x
    }

    for (i <- numbers) {
      println(calculateSeriesExpansion(i))
    }


  }

  private def calculateSeriesExpansion(x: Double) = {
    var terms = new Array[Double](10)
    for (i <- 0 to terms.length - 1) {
      val numerador = math.pow(x, i)
      val denominador = factorial(i)
      terms(i) = numerador / denominador
    }
    terms.sum
  }

  def factorial(n: Int): Int = {
    if (n == 0)
      1
    else
      n * factorial(n - 1)
  }
}
