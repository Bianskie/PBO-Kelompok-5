public class Admin extends User {
    
    public Admin(int id, String name, String email, String password, String address) {
        super(id, name, email, password, address);
    }

    // Manage product
    public void manageProduct(Product product) {
        // Logic to manage product
    }

    // Manage stock
    public void manageStock(Product product, int newStock) {
        product.updateStock(newStock);
    }
}
