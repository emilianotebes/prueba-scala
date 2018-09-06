package org.prueba

object MainApp extends App {
//  println("Hola mundo")
  val prueba = new Prueba()
//  println(prueba.saludar("Pepe"))
//
//  println(prueba.highOrder("Jose", prueba.saludar))
//
//  println(prueba.sumar(5)(8))
//
//  println(prueba.pruebaMatch(10))
//
//  prueba.printNTimes(11)
//
//  println(prueba.repeat(2, List(1, 2, 3)))

  println(prueba.newFilter(10, List(1, 2, 3, 23, 12, 2)))
}
