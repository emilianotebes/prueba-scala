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

}
