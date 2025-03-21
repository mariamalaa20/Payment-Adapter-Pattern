public class Main {
    public static void main(String[] args) {

        Payment cashPayment = new CashAdapter();
        Payment creditCardPayment = new CreditCardAdapter();
        Payment transferPayment = new TransferAdapter();

        System.out.println("Processing Payments...");
        cashPayment.makePayment(100.0);
        creditCardPayment.makePayment(250.0);
        transferPayment.makePayment(500.0);
    }
}
