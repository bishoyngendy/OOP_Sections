package clients;

import buisness.Product;
import payments.Cash;
import payments.IPaymentMethod;

public class Buyer {
    private String name;
    private IPaymentMethod paymentMethod;
    private int productsIndex;
    private Product[] purchasedProducts;

    public Buyer(String name) {
        this.name = name;
        this.paymentMethod = new Cash(100);
        this.productsIndex = 0;
        this.purchasedProducts = new Product[10];
    }

    public void buy(Product product) {
        purchasedProducts[productsIndex++] = product;
    }

    public int checkout() {
        int amount = 0;
        for (Product product : purchasedProducts) {
            if (product != null) {
                amount += product.getPrice();
            }
        }
        return amount;
    }

    public String getName() {
        return name;
    }

    public void pay(int amount) {
        paymentMethod.pay(amount);
    }

    public void setPaymentMethod(IPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
