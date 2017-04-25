package fppscala.week1

object Pascal {
  def apply(c: Int, r: Int): Int = {
    if (c == 0 || c >= r) 1
    else Pascal(c - 1, r - 1) + Pascal(c, r - 1)
  }
}
