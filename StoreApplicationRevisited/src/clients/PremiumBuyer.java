package clients;

public class PremiumBuyer extends Buyer {
    public PremiumBuyer(String name) {
        super(name);
    }

    @Override
    public int checkout() {
        int amount = super.checkout();
        return getDiscountedPrice(amount);
    }

    private int getDiscountedPrice(int amount) {
        return (int) (amount * 0.8);
    }
}
