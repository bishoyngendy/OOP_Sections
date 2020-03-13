package buisness;

public class Product {
    private String name;
    private String productCategory;
    private int price;

    void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        // validation
        if (price > 0) {
            this.price = price;
        }
    }

    void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getPrice() {
        return price;
    }
}
