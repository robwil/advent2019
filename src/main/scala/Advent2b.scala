object Advent2b {
  def main(args: Array[String]): Unit = {
    val answer = for {
      x <- 1 to 100
      y <- 1 to 100
      if Advent2a.executeProgram(Advent2a.Program.patch(1, Seq(x, y), 2)) == 19690720
    } yield (x, y)
    println(answer)
    println(100 * answer.head._1 + answer.head._2)
  }
}
