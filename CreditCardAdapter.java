public class CreditCardAdapter implements Payment {
    private CreditCardPaymentSystem creditCardPaymentSystem;

    public CreditCardAdapter() {
        this.creditCardPaymentSystem = new CreditCardPaymentSystem();
    }

    @Override
    public boolean makePayment(double amount) {
        return creditCardPaymentSystem.chargeCard("1234-5678-9012-3456", amount);
    }
}
