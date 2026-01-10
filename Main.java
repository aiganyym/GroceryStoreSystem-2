import java.util.ArrayList; 
import java.util.Scanner;   

public class Main {
    public static void main(String[] args) {
        
        ArrayList<User> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Store Management System ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Employee");
            System.out.println("3. View All (Polymorphism)");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String cName = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String cPhone = scanner.nextLine();
                    System.out.print("Enter loyalty points: ");
                    int points = scanner.nextInt();
                    
                    users.add(new Customer(cName, cPhone, points));
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String eName = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String ePhone = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Enter position: ");
                    String pos = scanner.nextLine();
                    users.add(new Employee(eName, ePhone, pos));
                    break;
                case 3:
                    System.out.println("\n--- User List ---");
                    for (User u : users) {
                        
                        u.displayInfo();

                        
                        if (u instanceof Customer) {
                            System.out.println("   -> This user has loyalty points.");
                        }
                    }
                    break;
                case 4:
                    running = false;
                    break;
            }
        }
        System.out.println("Program finished.");
    }
}
