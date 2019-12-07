import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.prop.TableDrivenPropertyChecks._

class Advent2aTest extends AnyFlatSpec {
  val testCases =
    Table(
      ("input", "expected"),
      (List(1, 0, 0, 0, 99), 2),
      (List(2, 3, 0, 3, 99), 2),
      (List(2, 4, 4, 5, 99, 0), 2),
      (List(1, 1, 1, 4, 99, 5, 6, 0, 99), 30)
    )

  forAll(testCases) { (input: List[Int], expected: Int) =>
    assert(Advent2a.executeProgram(input) === expected)
  }
}