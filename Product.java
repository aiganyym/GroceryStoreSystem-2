public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public void setPrice(double price) {

        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0;
            System.out.println("Warning: Price cannot be negative!");
        }
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public void setName(String name) {
        this.name = (name != null && !name.isEmpty()) ? name : "Unknown Product";
    }


    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    @Override
    public String toString() {
        return name + " - Price: " + price + "tg, Qty: " + quantity;
    }
}