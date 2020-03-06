package buisness;

public class Store {

    int productsIndex;
    Product[] products;

    public Store() {
        productsIndex = 0;
        products = new Product[100];
    }

    public Product[] browseAllProducts() {
        return products;
    }

    void addProduct(Product product) {
        products[productsIndex++] = product;
    }

}
