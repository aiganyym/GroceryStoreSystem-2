public class Employee extends User {
    private String position;

    public Employee(String name, String phone, String position) {
        super(name, phone);
        this.position = position;
    }

    @Override
    public void displayInfo() {
        System.out.println("[Employee] Name: " + name + " | Position: " + position);
    }
}