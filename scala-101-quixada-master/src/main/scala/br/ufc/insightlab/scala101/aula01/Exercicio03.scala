package br.ufc.insightlab.scala101.aula01

object Exercicio03 extends App{

  //  3. Escreva uma função RECURSIVA que receba um *Array[Char]* e retorne um *true* caso os parêntesis estejam balanceados ou *false*, caso contrário
  //  DICA: Crie uma função auxiliar para ajudar na recursão

  def balanceadoRecursivo(chars: Array[Char], i: Int, acc: Int): Int = {
    if(i < chars.length) acc
    else
      if(chars(i) == "(")
        balanceadoRecursivo(chars,i+1,acc+1)
    else if(chars(i) == ")")
      if(acc == 0) -1
      else balanceadoRecursivo(chars,i+1,acc-1)
    else balanceadoRecursivo(chars,i+1,acc)
  }

  def balaceado(chars: Array[Char]): Boolean =
    balanceadoRecursivo(chars,0,0) == 0

  val x1 = "Scala e (muito) dahora (meu (fi))"

  println(balaceado(x1.toCharArray))
}
