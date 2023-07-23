import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Train Booking Reservation System!");
        System.out.println("Please enter your name:");
        String name = input.nextLine();

        System.out.println("Please enter the number of tickets you would like to purchase:");
        int numTickets = input.nextInt();

        System.out.println("Please enter the name of the train you would like to book:");
        String trainName = input.nextLine();

        System.out.println("Please enter the date you would like to travel (MM/DD/YYYY):");
        String travelDate = input.nextLine();

        System.out.println("Your booking is complete!");
        System.out.println("Name: " + name);
        System.out.println("Number of Tickets: " + numTickets);
        System.out.println("Train Name: " + trainName);
        System.out.println("Travel Date: " + travelDate);
    }
}
