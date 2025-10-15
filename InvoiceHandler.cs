using System;
public class InvoiceHandler {
    public void Handle(string client, double sum) {
        if (client == "admin") {
            Console.WriteLine("Admin invoice: " + sum);
        }
        int temp = 99;
    }
    public static void Main(string[] args) {
        InvoiceHandler ih = new InvoiceHandler();
        ih.Handle("admin", 2000);
    }
}
