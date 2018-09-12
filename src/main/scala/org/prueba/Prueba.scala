package org.prueba


class Prueba {

  def saludar(nombre: String): String = {
    return "Hola " + nombre
  }

  def highOrder(nombre: String, funcion: String => String): String = {
    return funcion(nombre)
  }

  def sumar(a: Int)(b: Int): Int = {
    return a + b
  }

  def pruebaMatch(x: Int): String = x match {
    case 1 => "one"
    case _ => "bleee"
  }

  def printNTimes(n: Int) = {
    var i = 0
    for (i <- 1 to n) {
      println("Hello World")
    }
  }

  def repeat(num: Int, arr: List[Int]): List[Int] = {
    var newList: List[Int] = List()
    arr.foreach(eachElem => {
      var i = 0
      for (i <- 1 to num) {
        newList = newList.:+(eachElem)
      }
    })
    return newList
  }

  def newFilter(delim: Int, arr: List[Int]): List[Int] = {
    return arr.filter(p => p < delim)
  }

  def filterOddPositions(arr: List[Int]): List[Int] = {
    val filteredIndices = arr.indices.filter(i => isOdd(i))
    return filteredIndices.map(i => arr(i)).toList
  }

  private def isOdd(i: Int) = {
    i % 2 == 1 || i % 2 == -1
  }


  def intToArray(num: Int): List[Int] = {
    val myList = List.range(0, num)
    myList
  }

  def reverseWithoutReverse(arr: List[Int]): List[Int] = {
    var newList: List[Int] = List()
    for (i <- arr.length - 1 to 0 by -1) {
      newList = newList.:+(arr(i))
    }
    newList
  }

  def sumOddElements(arr: List[Int]): Int = {
    arr.filter(n => isOdd(n)).sum
  }

  def countElements(arr: List[Int]): Int = {
    var bla = 0
    arr.foreach(f => bla = bla + 1)
    bla
  }

  def updateUsingAbsoluteValues(arr: List[Int]): List[Int] = {
    arr.map(p => {
      if (p < 0) {
        p * (-1)
      } else {
        p
      }
    })
  }

  def eX
}
