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
    arr.filter(p => isOdd(arr.indexOf(p)))
    var i = 0;
    var newArray = List()
    for (i <- 0 to arr.length - 1) {
      if (isOdd(i)) {
        newArray = newArray.
      }
    }
    return newArray
  }

  private def isOdd(i: Int) = {
    i % 2 == 1
  }
}
