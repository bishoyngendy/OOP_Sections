package buisness;

public class Seller {
    String name;
    Store store;

    public Seller(String name, Store store) {
        this.name = name;
        this.store = store;
    }

    public void addProductToStore(String name, int price) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setProductCategory("Food");
        store.addProduct(product);
    }
}
