package payments;

public interface IPaymentMethod {
    void pay(int amount);
    int getBalance();
}
