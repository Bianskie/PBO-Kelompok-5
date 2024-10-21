public class Transaksi {
    private int transaksiId;
    private Order order;
    private String paymentMethod;
    private double amount;

    // Constructor
    public Transaksi(int transaksiId, Order order, String paymentMethod, double amount) {
        this.transaksiId = transaksiId;
        this.order = order;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    // Getters and Setters
    public int getTransaksiId() { return transaksiId; }
    public void setTransaksiId(int transaksiId) { this.transaksiId = transaksiId; }
    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    // Process payment
    public void processPayment() {
        // Logic for processing payment
    }
}
