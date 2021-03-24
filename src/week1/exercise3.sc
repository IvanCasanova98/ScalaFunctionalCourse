



def countChange(money: Int, coins: List[Int]): Int = {
  def count(m: Int, c: List[Int]) : Int = {
    if (c.isEmpty) 0
    else if (m - c.head == 0) 1
    else if (m - c.head < 0) 0
    else countChange(m - c.head, c) + countChange(m, c.tail)
  }
  count(money, coins.sorted)

}