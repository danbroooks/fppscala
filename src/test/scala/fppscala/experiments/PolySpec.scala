package fppscala

import org.scalatest._
import Poly._

class PolySpec extends FreeSpec with Matchers {
  "Poly" - {
    "should" in {
      val dogOwner = new PetOwner[Dog]

      val simon = new Dog
      dogOwner.strokePet(simon) should be("Woof!")

      val missy = new Cat
      "dogOwner.strokePet(missy)" shouldNot typeCheck
    }
  }
}
