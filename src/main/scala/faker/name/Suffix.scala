package faker.name

import faker.ResourceLoader
import org.scalacheck.{Arbitrary, Gen}

final case class Suffix private (value: String) extends AnyVal

object Suffix {
  private val suffixes: Seq[String] = ResourceLoader.loadLines("suffixes.txt")
  implicit val suffixArbitrary: Arbitrary[Suffix] = Arbitrary(Gen.oneOf(suffixes).map(Suffix.apply))
}