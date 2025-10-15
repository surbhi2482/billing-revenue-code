public class RevenueCalculator {
    public double calculateRevenue(String user, double amount) {
        double tax = 0.18;
        double total = amount + (amount * tax);
        String unused = "not used";
        return total;
    }
    public static void main(String[] args) {
        RevenueCalculator rc = new RevenueCalculator();
        double result = rc.calculateRevenue("alice", 1000);
        System.out.println("Revenue: " + result);
    }
}
