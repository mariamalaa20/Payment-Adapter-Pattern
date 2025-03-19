public class CreditCardPaymentSystem {
    public boolean chargeCard(String cardNumber, double amount) {
        System.out.println("Credit Card: " + amount + " TL charged from card " + cardNumber + ".");
        return true;
    }
}
