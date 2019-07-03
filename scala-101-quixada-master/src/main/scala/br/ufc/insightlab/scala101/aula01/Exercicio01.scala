package br.ufc.insightlab.scala101.aula01

object Exercicio01 extends App{

  //  1. Escreva uma função (de preferência, recursiva) que receba um inteiro n retorna o *n-ésimo* número de Fibonnaci

  def fib(x: Int): Int = {
    if(x == 0) 0
    else if ( x == 1) 1
    else fib(x-1) + fib(x-2)
  }

  for(i <- 0 to 5) println(fib(i))
}
