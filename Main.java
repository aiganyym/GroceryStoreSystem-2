import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        users.add(new Customer("Aiganym", "87001112233", 50));
        users.add(new Employee("Batyr", "87004445566", "Cashier"));

        System.out.println("--- Store Management System ---");


        for (User u : users) {
            u.displayInfo();
        }
    }
}