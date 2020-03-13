package payments;

public class Cash implements IPaymentMethod {

    private int balance;

    public Cash(int balance) {
        this.balance = balance;
    }

    @Override
    public void pay(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Paid Via Cash: " + amount);
        } else {
            System.out.println("Not enough balance");
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
