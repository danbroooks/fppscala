package fppscala

object Poly {
  abstract class Pet {
    def makeSound: String
  }

  class Dog extends Pet {
    def makeSound = "Woof!"
  }

  class Cat extends Pet {
    def makeSound = "Meow!"
  }

  class PetOwner[A <: Pet] {
    def strokePet(pet: A) =
      pet.makeSound
  }
}
