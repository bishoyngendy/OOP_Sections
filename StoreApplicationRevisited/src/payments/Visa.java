package payments;

public class Visa implements IPaymentMethod {

    private String cardNumber;

    public Visa(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        // Connect to bank
        // check card validity
        // check enough balance
        // pay
    }

    @Override
    public int getBalance() {
        // Connect to bank
        // check card validity
        // check enough balance
        // return balance
        return 0;
    }
}
