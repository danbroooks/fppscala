package fppscala.funsets

import org.scalatest._
import FunSets._

class FunSetsSpec extends FreeSpec with Matchers {

  trait TestSets {
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)
  }

  "FunSets" - {
    "contains is implemented" in {
      contains(x => true, 100) should be(true)
    }

    "singletonSet(1) contains 1" in {
      new TestSets {
        contains(s1, 1) should be(true)
        contains(s2, 2) should be(true)
        contains(s3, 3) should be(true)
      }
    }

    "rangeSet(0, 5) contains 1" in {
      val r1 = rangeSet(0, 5)
      contains(r1, 1) should be(true)
    }

    "union contains all elements of each set" in {
      new TestSets {
        val s = union(s1, s2)
        contains(s, 1) should be(true)
        contains(s, 2) should be(true)
        contains(s, 3) should be(false)
      }
    }

    "intersect should return list of elements that appear in both lists" in {
      val isct = intersect(
        rangeSet(0, 5),
        rangeSet(3, 7)
      )

      contains(isct, 4) should be(true)
      contains(isct, 11) should be(false)
    }

    "diff should return elements that aren't contained in both" in {
      val d = diff(
        rangeSet(0, 5),
        rangeSet(3, 7)
      )

      contains(d, 2) should be(true)
      contains(d, 4) should be(false)
    }

    "filter should filter out elements that dont match predicate" in {
      val r = rangeSet(3, 7)
      val fl = filter(r, _ > 5)

      contains(fl, 6) should be(true)
      contains(fl, 4) should be(false)
    }

    "forall should check if predicate matches for all elements" in {
      val r = rangeSet(3, 7)
      forall(r, _ > 2) should be(true)
      forall(r, _ < 8) should be(true)
      forall(r, _ == 5) should be(false)
    }

    "should check if element exists that matches predicate" in {
      val r = rangeSet(3, 9)
      exists(r, _ == 5) should be(true)
      exists(r, _ > 5) should be(true)
      exists(r, _ < 5) should be(true)
      exists(r, _ == 0) should be(false)
    }

    "should be mappable" in {
      val r = singletonSet(1)
      exists(map(r, _ + 1), _ == 2) should be(true)
    }
  }
}
