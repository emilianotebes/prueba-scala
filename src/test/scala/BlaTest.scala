import org.prueba.Prueba
import org.scalatest.{FlatSpec, Matchers}

class BlaTest extends FlatSpec with Matchers {
  "filterOddPositions"
  it should "filter odd positions in array" in {
    var prueba = new Prueba()
    var myList = List(2, 5, 3, 4, 6, 7, 9, 8)
    var filteredList = prueba.filterOddPositions(myList)
    filteredList(0) should be(5)
    filteredList(1) should be(4)
    filteredList(2) should be(7)
    filteredList(3) should be(8)
  }
  it should "filter odd positions in array with repeated numbers" in {
    var prueba = new Prueba()
    var myList = List(8, 15, 22, 1, 10, 6, 2, 18, 18, 1)
    var filteredList = prueba.filterOddPositions(myList)
    filteredList(0) should be(15)
    filteredList(1) should be(1)
    filteredList(2) should be(6)
    filteredList(3) should be(18)
    filteredList(4) should be(1)
  }

  "intToArray" should "return an array when given an Int" in {
    var prueba = new Prueba
    val bla = prueba.intToArray(12)
    bla.size should be(12)
  }

  "reverseWithoutReverse" should "return a reverse list without calling reverse function" in {
    val originalList = List(1, 2, 3, 4)
    val prueba = new Prueba

    val reversed = prueba.reverseWithoutReverse(originalList)
    reversed(0) should be(4)
    reversed(3) should be(1)

  }

  "sumOddElements" should "return the sum of the odd elemens" in {
    val originalList = List(1, 2, 3, 4)
    val prueba = new Prueba

    val sum = prueba.sumOddElements(originalList)
    sum should be(4)

  }

  "sumOddElements" should "return the sum of the odd elemens when using negative numbers" in {
    val originalList = List(-1, 2, 3, 4)
    val prueba = new Prueba

    val sum = prueba.sumOddElements(originalList)
    sum should be(2)

  }

  "countElements" should "return the length of the array" in {
    val originalList = List(-1, 2, 3, 4)
    val prueba = new Prueba

    val sum = prueba.countElements(originalList)
    sum should be(4)

  }

  "updateUsingAbsoluteValues" should "update negative values" in {
    val originalList = List(-1, 2, 3, 4, 0)
    val prueba = new Prueba

    val newList = prueba.updateUsingAbsoluteValues(originalList)
    newList(0) shouldBe (1)
    newList(1) shouldBe (2)
    newList(4) shouldBe (0)

  }

  "probando for" should "ble" in {
    val prueba = new Prueba
    prueba.bla(12)
  }


}
