package br.ufc.insightlab.scala101.aula02

object Exercicio03 extends App {

  // 3. O código abaixo faz a leitura do dataset de flores [Iris](https://archive.ics.uci.edu/ml/datasets/iris).
  // Transforme as linhas do arquivo em uma *case class Amostra* , que representa uma linha do dataset.
  // Por fim, compute a média dos 4 atributos em cada classe (setosa, versicolor e virginica)

  //importando o objeto Source, que auxilia na manipulação de arquivos
  import scala.io.Source

  case class Amostra(sl: Double, sw: Double, pl: Double, pw: Double, c: String)

  //lendo as linhas do arquivo
  //NOTA: por padrão, o método Souce.fromFile retorna um Iterável que NÂO está totalmente em memória
  //NOTA 2: é dado um drop(1) nas linhas para descartar a primeira linha, que é o cabeçalho do dataset
  val lines = Source.fromFile("iris-dataset.txt").getLines.drop(1)

  val amostras = lines
    .map(_.split("\t"))
    .map(values => Amostra(
      values(0).toDouble,
      values(1).toDouble,
      values(2).toDouble,
      values(3).toDouble,
      values(4)
    ))

  val amostrasAgrupadas = amostras.toList.groupBy(_.c)

  amostrasAgrupadas.foreach{
    case(classe, amostras) =>
      val slTotoal = amostras.map(_.sl).sum
      val slMedio = slTotoal / amostras.size

      val swTotoal = amostras.map(_.sw).sum
      val swMedio = swTotoal / amostras.size

      val plTotoal = amostras.map(_.pl).sum
      val plMedio = plTotoal / amostras.size

      val pwTotoal = amostras.map(_.pw).sum
      val pwMedio = pwTotoal / amostras.size
  }

}
