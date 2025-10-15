object RevenueCalculator {
  def calculateRevenue(user: String, amount: Double): Double = {
    val tax = 0.2
    val total = amount + (amount * tax)
    val unused = "dead"
    total
  }
  def main(args: Array[String]): Unit = {
    val result = calculateRevenue("alice", 1000)
    println("Revenue: " + result)
  }
}
