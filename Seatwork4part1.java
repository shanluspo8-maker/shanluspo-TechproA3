public class Seatwork4part1 {

    public void processPayment(double amount, String currency) {
        System.out.println("Processing payment of " + amount + " " + currency);
    }

    public void processPayment(double amount, String currency, String paymentMethod) {
        System.out.println("Processing payment of " + amount + " " + currency + " via " + paymentMethod);
    }

    // main method
    public static void main(String[] args) {

        Seatwork4part1 processor = new Seatwork4part1();

        processor.processPayment(100.0, "ETH");
        processor.processPayment(250.0, "Vbucks", "Robux");
    }
}