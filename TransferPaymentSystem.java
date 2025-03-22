public class TransferPaymentSystem {
    public boolean sendTransfer(String IBAN, double amount) {
        System.out.println("Transfer: " + amount + " TL sent via IBAN " + IBAN + ".");
        return true;
    }
}
