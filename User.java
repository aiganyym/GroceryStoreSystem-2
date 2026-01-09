public class User {
    protected String name;
    protected String phone;

    public User(String name, String phone) {
        setName(name);
        this.phone = phone;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Guest";
        }
    }

    public void displayInfo() {
        System.out.println("User: " + name);
    }
}