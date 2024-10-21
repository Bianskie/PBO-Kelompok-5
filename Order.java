import java.util.List;

public class Order {
    private int orderId;
    private User user;
    private List<Product> productList;
    private double totalAmount;
    private String orderStatus;
    private Shipping shipping;

    // Constructor
    public Order(int orderId, User user, List<Product> productList, double totalAmount, String orderStatus, Shipping shipping) {
        this.orderId = orderId;
        this.user = user;
        this.productList = productList;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
        this.shipping = shipping;
    }

    // Getters and Setters
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public List<Product> getProductList() { return productList; }
    public void setProductList(List<Product> productList) { this.productList = productList; }
    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
    public String getOrderStatus() { return orderStatus; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }
    public Shipping getShipping() { return shipping; }
    public void setShipping(Shipping shipping) { this.shipping = shipping; }

    // Confirm order
    public void confirmOrder() {
        this.orderStatus = "Confirmed";
    }
}
