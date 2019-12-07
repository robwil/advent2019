import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.prop.TableDrivenPropertyChecks._

class Advent1bTest extends AnyFlatSpec {
  val testCases =
    Table(
      ("input", "expected"),
      (12, 2L),
      (1969, 966L),
      (100756, 50346L)
    )

  forAll(testCases) { (input: Int, expected: Long) =>
    assert(Advent1b.getFuelRequired(input) === expected)
  }
}