package fppscala.recfun

object CountingChange {
  def apply(money: Int, coins: List[Int]): Int =
    if (money == 0) 1
    else if (coins.isEmpty || money < 0) 0
    else CountingChange(money - coins.head, coins) + CountingChange(money, coins.tail)
}
