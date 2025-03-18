public class CashAdapter implements Payment {
    private CashPaymentSystem cashPaymentSystem;

    public CashAdapter() {
        this.cashPaymentSystem = new CashPaymentSystem();
    }

    @Override
    public boolean makePayment(double amount) {
        cashPaymentSystem.receiveCash(amount);
        return true;
    }
}
