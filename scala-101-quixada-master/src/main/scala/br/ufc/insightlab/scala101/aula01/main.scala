package br.ufc.insightlab.scala101.aula01

object main extends App{

  class Racional(a: Int, b: Int){
    def numerador: Int = a
    def denominador: Int = b

    override def toString(): String = s"$a/$b"

    def +(x: Racional): Racional = {
      val d = this.denominador * x.denominador
      val n = this.numerador*x.denominador + x.numerador*this.denominador

      new Racional(n,d)
    }

    def -(x: Racional): Racional = {
      val d = this.denominador * x.denominador
      val n = this.numerador*x.denominador - x.numerador*this.denominador

      new Racional(n,d)
    }
  }

  val meio = new Racional(1,2)
  println(meio)

  val terco = new Racional(1,3)
  println(terco)

  val quatroSextos = meio + terco
  println(quatroSextos)

  val umSexto = meio - terco
  println(umSexto)

}
