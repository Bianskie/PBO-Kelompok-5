import java.util.ArrayList;
import java.util.List;

public class Keranjang {
    private List<Product> products;
    private User user;

    // Constructor
    public Keranjang(User user) {
        this.user = user;
        this.products = new ArrayList<>();
    }

    // Add product to cart
    public void addProduct(Product product) {
        products.add(product);
    }

    // Remove product from cart
    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Calculate total price
    public double calculateTotal() {
        double total = 0;
        for(Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}
