//val a = Map("a" -> 1,"b" -> 2, "c" -> 3)



//val l = List(3,7,2,15)
//
//l groupBy(_%2)


//val l2 =
//  l
//    .filter(_%2 == 0)
//    .flatMap(0 to _)

//  for{
//    x <- l
//    if x%2 == 0
//    j <- 0 to x
//  } yield j

//val pares =
//  for {
//    x <- l
//    if x%2 == 0
//  }yield x*2


//val l = List(1,2,3,4,1,2,3)
//
//val l2 =
//  l.flatMap(0 to _)

//val l2 =
//  l map (_*2)

//val l2 =
//  l map (x => x*2)

//l.distinct

//val l2 = 10 :: l //concatena valor no inicio da lista
//
//val l3 = l :+ 10 //concatena valor no final da lista
//
//l ::: l //concatena duas listas
//
//l ++ l //concatena duas listas
//
//l.isEmpty
//
//l.nonEmpty

//val x = (1, "string",'c')
//
//x._1
//x._2
//x._3
//
//val (a,b,c) = x

//def somar(a: Int, b: Int): Int =
//  a + b
//
//def subtrair(a: Int, b: Int): Int =
//  a - b
//
//type OperacaoBinaria = (Int, Int) => Int
//
//val x: OperacaoBinaria = subtrair
//
//def exec(a: Int, b: Int, f: OperacaoBinaria) =
//  println(f(a,b))
//
//exec(1,2,somar)
//exec(1,2,subtrair)
//exec(5,4,(a,b) => a*b)

//val z = subtrair(_,_)
//
//z(1,3)
//
//val x: (Int, Int) => Int = somar
//val y: (Int, Int) => Int = subtrair
//
//x(1,3)
//y(1,3)

//-------------------------------------
//class Produto(id: Int, nome: String){
//  def getNome: String = nome
//  def getID: Int = id
//}
//
//object Produto {
//  private var nextId: Int = 0
//
//  def apply(nome: String): Produto ={
//    nextId += 1
//    new Produto(nextId, nome)
//  }
//
//  def unapply(p: Produto): Option[(Int, String)] = {
//    Some((p.getID, p.getNome))
//  }
//}
//
//val p = Produto("Amoeba")
//
//p match {
//  case Produto(id, nome) => println(nome)
//}

//import scala.{Option, Some, None}
//
//val op: Option[Int] = None
//
//op match {
//  case Some(x) => println(x)
//  case None => println("Vazio!")
//}

//import scala.util.{Try, Success, Failure}
//
//Try(10/0) match {
//  case Success(x) => println(s"Sucesso! $x")
//  case Failure(e) => println(s"Erou! \n$e")
//}

//val x: Any = true
//
//x match {
//  case 5 => println("x e 5")
//  case 10 => println("x e 10")
//  case "ola" => println("oi!")
//  case b: Boolean => println(s"valor: ${x}")
//  case _ => println("x nao e 5 nem 10")
//}

//class Produto(id: Int, nome: String){
//  def getNome: String = nome
//  def getID: Int = id
//}
//
//object Produto {
//  var nextId: Int = 0
//
//  def apply(nome: String): Produto ={
//    nextId += 1
//    new Produto(nextId, nome)
//  }
//}
//
//val p = Produto("Castanha")
//
//println(p.getID)
//println(p.getNome)


//def mostrarRecursivo(x: Int): Unit = {
//  println(x)
//  if(x > 0)
//    mostrarRecursivo(x - 1)
//}
//
//mostrarRecursivo(10)

//def funcao(x: Int): Int = {
//  return x + x
//}

//println(s"${funcao(10)}")

//var count = 0
//
//while (count < 5){
//  println(count)
//  count += 1
//}

//for{
//  i <- 1 to 10
//  if i%2 == 0
//} yield println(i)


//for{
//  i <- 1 to 3
//  j <- 1 to 3
//  if j > i
//}println(s"($i,$j)")

//for(i <- 1 to 3)
//  for(j <- 1 to 3)
//    if(j > i)
//      println(s"($i,$j)")

//for(i <- 1 until 10) print(i)

//var x = 2
//if(x%2 == 0) println("X e par")
//else println("X e impar")

//val paridade =
//  if (x%2 == 0) "par"
//    else "Impa"