import java.util.Scanner;

public class MenuDrivenProgram {
    
    // Method to display the menu options
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }
    
    // Method to handle user choice
    public static void handleMenuChoice(int choice) {
        Scanner scanner = new Scanner(System.in);
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }
    
    // Method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }
    
    // Method to check if a number is even or odd
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Clear invalid input
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                handleMenuChoice(choice);
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.next(); // Clear invalid input
            }
        }
    }
}
