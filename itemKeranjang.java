public class ItemKeranjang {
    
    private int itemKeranjangID;
    private int cartID;
    private int productID;
    private int quantity;
    private double priceAtPurchase;

    // Constructor
    public ItemKeranjang(int cartItemID, int cartID, int productID, int quantity, double priceAtPurchase) {
        this.itemKeranjangID = cartItemID;
        this.cartID = cartID;
        this.productID = productID;
        this.quantity = quantity;
        this.priceAtPurchase = priceAtPurchase;
    }

    // Getters and Setters
    public int getItemKeranjangID() {
        return itemKeranjangID;
    }

    public void setItemKeranjangID(int itemKeranjangID) {
        this.itemKeranjangID = itemKeranjangID;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPriceAtPurchase() {
        return priceAtPurchase;
    }

    public void setPriceAtPurchase(double priceAtPurchase) {
        this.priceAtPurchase = priceAtPurchase;
    }

}
