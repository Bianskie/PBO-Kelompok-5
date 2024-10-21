public class Shipping {
    private int shippingId;
    private String shippingAddress;
    private String shippingStatus;

    // Constructor
    public Shipping(int shippingId, String shippingAddress, String shippingStatus) {
        this.shippingId = shippingId;
        this.shippingAddress = shippingAddress;
        this.shippingStatus = shippingStatus;
    }

    // Getters and Setters
    public int getShippingId() { return shippingId; }
    public void setShippingId(int shippingId) { this.shippingId = shippingId; }
    public String getShippingAddress() { return shippingAddress; }
    public void setShippingAddress(String shippingAddress) { this.shippingAddress = shippingAddress; }
    public String getShippingStatus() { return shippingStatus; }
    public void setShippingStatus(String shippingStatus) { this.shippingStatus = shippingStatus; }
}
