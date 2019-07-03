//package br.ufc.insightlab.scala101.aula01
//
//object Exercicio04 extends App{
//
//  //  4. Escreva uma classe que represente uma matriz m x n que tenha os seguintes métodos:
//  //
//  //    * Criar uma matriz informando suas dimensões (m x n);
//  //    * Acessar o elemento da matriz dada uma coordenada;
//  //    * Alterar o elemento da matriz dada uma coordenada;
//  //    * Imprimir a matriz na tela
//  //
//  //  Implemente também as seguintes operações:
//  //
//  //    * Soma
//  //    * Subtração
//
//  class Matriz(val m: Int, val n: Int){
//      private val matriz: Array[Array[Int]] = Array.ofDim[Int](m,n)
//
//      def apply(i: Int, j: Int): Double =
//        matriz(i)(j)
//
////      def update(i: Int, j: Int, c: Double): Unit =
////        matriz(i)(j) = x
//
//      override def toString: String = {
//        var r = ""
//        for( i <- 0 until m){
//          for(j <- 0 until n){
//            r += this(i,j) + " "
//          }
//          r += "\n"
//        }
//        r
//      }
//
//    def +(B: Matriz): Matriz = {
//      val C = new Matriz(m,n)
//      for{
//         i <- 0 until m
//         j <- 0 until n
//      } C(i,j) = this(i,j) + B(i,j)
//
//      C
//    }
//  }
//
//}
