public class TransferAdapter implements Payment {
    private TransferPaymentSystem transferPaymentSystem;

    public TransferAdapter() {
        this.transferPaymentSystem = new TransferPaymentSystem();
    }

    @Override
    public boolean makePayment(double amount) {
        return transferPaymentSystem.sendTransfer("TR123456789012345678901234", amount);
    }
}
