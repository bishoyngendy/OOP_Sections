package clients;

import buisness.Product;

public class Buyer {
    private String name;
    private int balance;
    private int productsIndex;
    private Product[] purchasedProducts;

    public Buyer(String name, int balance) {
        this.name = name;
        this.balance = balance;
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
}
