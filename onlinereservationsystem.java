// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

class Reservation {
    private String name;
    private int trainNumber;
    private String classType;
    private String journeyDate;
    private String fromPlace;
    private String toPlace;

    public Reservation(String name, int trainNumber, String classType, String journeyDate, String fromPlace, String toPlace) {
        this.name = name;
        this.trainNumber = trainNumber;
        this.classType = classType;
        this.journeyDate = journeyDate;
        this.fromPlace = fromPlace;
        this.toPlace = toPlace;
    }

    public void displayReservationDetails() {
        System.out.println("Reservation Details:");
        System.out.println("Name: " + name);
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Class Type: " + classType);
        System.out.println("Journey Date: " + journeyDate);
        System.out.println("From: " + fromPlace);
        System.out.println("To: " + toPlace);
    }
}

class ReservationSystem {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a user with a valid login ID and password
        User user = new User("admin", "password");

        // Login Form
        System.out.println("Login Form");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (user.authenticate(username, password)) {
            System.out.println("Login successful!");
            System.out.println();

            // Reservation System
            System.out.println("Reservation Form");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Train Number: ");
            int trainNumber = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Class Type: ");
            String classType = scanner.nextLine();
            System.out.print("Journey Date: ");
            String journeyDate = scanner.nextLine();
            System.out.print("From: ");
            String fromPlace = scanner.nextLine();
            System.out.print("To: ");
            String toPlace = scanner.nextLine();

            Reservation reservation = new Reservation(name, trainNumber, classType, journeyDate, fromPlace, toPlace);
            reservation.displayReservationDetails();

            // Cancellation Form
            System.out.println();
            System.out.println("Cancellation Form");
            System.out.print("Enter PR number: ");
            String prNumber = scanner.nextLine();
            System.out.println("Cancelling reservation with PR number: " + prNumber);
            System.out.println("Are you sure you want to cancel? (Press OK to confirm)");
            String confirmCancellation = scanner.nextLine();

            if (confirmCancellation.equalsIgnoreCase("OK")) {
                System.out.println("Reservation with PR number " + prNumber + " has been cancelled.");
            } else {
                System.out.println("Cancellation not confirmed. Reservation remains valid.");
            }
        } else {
            System.out.println("Invalid login credentials. Access denied!");
        }
    }
}
           

           

