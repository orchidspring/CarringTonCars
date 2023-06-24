
import java.util.Scanner;

public class MenuDisplay {

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("---- Carrington Cars Menu ----");
            System.out.println("1. List all cars");
            System.out.println("2. Add a car");
            System.out.println("3. Remove a car");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Invalid choice. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    // Code to list all cars
                    break;
                case 2:
                    // Code to add a car
                    break;
                case 3:
                    // Code to remove a car
                    break;
                case 0:
                    System.out.println("Exiting Carrington Cars menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid menu option.");
            }
        }

        scanner.close();
    }

}
