public class Sale {
    private String customerName;
    private double amount;
    private String status;

    public Sale(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
        this.status = "Pending";
    }

    public void completeSale() {
        this.status = "Completed";
    }

    @Override
    public String toString() {
        return "Order for " + customerName + " | Total: " + amount + " | Status: " + status;
    }
}