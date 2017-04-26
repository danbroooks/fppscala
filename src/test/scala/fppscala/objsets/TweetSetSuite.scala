package fppscala.objsets

import org.scalatest._

class TweetSetSpec extends FreeSpec with Matchers {

  trait TestSets {
    val set1 = new Empty
    val set2 = set1.incl(new Tweet("a", "a body", 20))
    val set3 = set2.incl(new Tweet("b", "b body", 20))
    val c = new Tweet("c", "c body", 7)
    val d = new Tweet("d", "d body", 9)
    val set4c = set3.incl(c)
    val set4d = set3.incl(d)
    val set5 = set4c.incl(d)
  }

  def asSet(tweets: TweetSet): Set[Tweet] = {
    var res = Set[Tweet]()
    tweets.foreach(res += _)
    res
  }

  def size(set: TweetSet): Int = asSet(set).size

  "TweetSet" - {
    "filter: on empty set" in {
      new TestSets {
        size(set1.filter(tw => tw.user == "a")) should be(0)
      }
    }

    "filter: a on set5" in {
      new TestSets {
        size(set5.filter(tw => tw.user == "a")) should be(1)
      }
    }

    "filter: 20 on set5" in {
      new TestSets {
        size(set5.filter(tw => tw.retweets == 20)) should be(2)
      }
    }

    "union: set4c and set4d" in {
      new TestSets {
        size(set4c.union(set4d)) should be(4)
      }
    }

    "union: with empty set (1)" in {
      new TestSets {
        size(set5.union(set1)) should be(4)
      }
    }

    "union: with empty set (2)" in {
      new TestSets {
        size(set1.union(set5)) should be(4)
      }
    }

    "descending: set5" in {
      new TestSets {
        val trends = set5.descendingByRetweet
        trends.isEmpty should be(false)
        (trends.head.user == "a" || trends.head.user == "b") should be(true)
      }
    }
  }
}
