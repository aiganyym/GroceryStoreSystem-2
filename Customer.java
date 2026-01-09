public class Customer extends User {
    private int loyaltyPoints;

    public Customer(String name, String phone, int points) {
        super(name, phone);
        setLoyaltyPoints(points);
    }

    public void setLoyaltyPoints(int points) {
        this.loyaltyPoints = (points >= 0) ? points : 0; // Валидация [cite: 30]
    }

    @Override
    public void displayInfo() {
        System.out.println("[Customer] Name: " + name + " | Points: " + loyaltyPoints);
    }
}