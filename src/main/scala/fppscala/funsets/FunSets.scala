package fppscala.funsets

object FunSets {

  type Set = Int => Boolean

  def contains(s: Set, elem: Int): Boolean = s(elem)

  def singletonSet(elem: Int): Set = (el) => el == elem

  def rangeSet(min: Int, max: Int): Set = (el) => el >= min && el <= max

  def union(s: Set, t: Set): Set = (elem) => contains(s, elem) || contains(t, elem)

  def intersect(s: Set, t: Set): Set = (elem) => contains(s, elem) && contains(t, elem)

  def diff(s: Set, t: Set): Set = (elem) => contains(s, elem) && !contains(t, elem)

  def filter(s: Set, p: Int => Boolean): Set = (elem) => contains(s, elem) && p(elem)

  val bound = 1000

  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      if (contains(s, a) && !p(a)) false
      else if (a > bound || a < 0 - bound) true
      else iter(a - 1)
    }
    iter(bound)
  }

  def exists(s: Set, p: Int => Boolean): Boolean = !forall(s, (x) => !p(x))

  def map(s: Set, f: Int => Int): Set = (y) => exists(s, x => y == f(x))

  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  }

  def printSet(s: Set) {
    println(toString(s))
  }
}
