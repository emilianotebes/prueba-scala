import org.prueba.Magic
import org.scalatest.{FlatSpec, Matchers}

class MagicTest extends FlatSpec with Matchers {

  "last" should "return last" in {
    val last = Magic.last(List(1, 2, 3))
    assert(last.equals(3))
  }

  "penultimate" should "return penultimate" in {
    val penultimate = Magic.penultimate(List(1, 2, 3, 4, 5, 6))
    assert(penultimate.equals(5))
  }
  it should "throw exception if not enough elements" in {
    assertThrows[NoSuchElementException](Magic.penultimate(List(1)))
  }
  it should "throw exception if empty list" in {
    assertThrows[NoSuchElementException](Magic.penultimate(List()))
  }

  "nth" should "return first with 0 " in {
    val nth = Magic.nth(0, List(1, 2, 3, 4, 5, 6))
    assert(nth.equals(1))
  }
  it should "6 in 5" in {
    val nth = Magic.nth(5, List(1, 2, 3, 4, 5, 6))
    assert(nth.equals(6))
  }

}
