import org.scalatest.{FlatSpec, Matchers}

class SolutionTest extends FlatSpec with Matchers {

  "solution" should "return e pow(x)" in {

    val input = Array("4", "20.0000", "5.0000", "0.5000", "-0.5000")
    val expectedOutput = Array("2423600.1887", "143.6895", "1.6487", "0.6065")
    val output: Array[String] = Solution.main(input)

    output(0) should be(expectedOutput(0))
  }

}
