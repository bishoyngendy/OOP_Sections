import buisness.Product;
import buisness.Seller;
import buisness.Store;
import clients.Buyer;
import clients.PremiumBuyer;
import payments.Visa;

public class ShoppingMain {
    public static void main(String[] args) {
        Store carrefour = new Store();
        Seller mohamed = new Seller("Mohamed", carrefour);
        Buyer ahmed = new Buyer("Ahmed");
        PremiumBuyer salwa = new PremiumBuyer("Salwa");

        mohamed.addProductToStore("Cheese", 10);
        mohamed.addProductToStore("Olive", 5);
        mohamed.addProductToStore("Bread", 1);

        Product[] availableProducts = carrefour.browseAllProducts();

        ahmed.buy(availableProducts[0]);
        ahmed.buy(availableProducts[1]);

        salwa.buy(availableProducts[0]);
        salwa.buy(availableProducts[1]);

        int ahmedInvoice = ahmed.checkout();
        int salwaInvoice = salwa.checkout();

        System.out.println(ahmed.getName() + " should pay " + ahmedInvoice);
        System.out.println(salwa.getName() + " should pay " + salwaInvoice);

        ahmed.pay(ahmedInvoice);
        salwa.pay(salwaInvoice);

        salwa.setPaymentMethod(new Visa("CIB:1234"));
    }
}
