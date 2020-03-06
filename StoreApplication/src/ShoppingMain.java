import buisness.Product;
import buisness.Seller;
import buisness.Store;
import clients.Buyer;

public class ShoppingMain {
    public static void main(String[] args) {
        Store carrefour = new Store();
        Seller mohamed = new Seller("Mohamed", carrefour);
        Buyer ahmed = new Buyer("Ahmed", 100);

        mohamed.addProductToStore("Cheese", 10);
        mohamed.addProductToStore("Olive", 5);
        mohamed.addProductToStore("Bread", 1);

        Product[] availableProducts = carrefour.browseAllProducts();

        ahmed.buy(availableProducts[0]);
        ahmed.buy(availableProducts[1]);

        int amountToPay = ahmed.checkout();
        System.out.println(amountToPay);
    }
}
