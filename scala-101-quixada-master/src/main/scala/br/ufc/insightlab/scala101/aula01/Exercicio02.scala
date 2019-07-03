package br.ufc.insightlab.scala101.aula01

object Exercicio02 extends App{

  //  2. Escreva uma função que gere todas as peças de um Dominó

  def mostraDomino(): Unit = {
    for{
      i <- 0 to 6
      j <- i to 6
    }println(s"($i,$j)")
  }

  mostraDomino()
}
