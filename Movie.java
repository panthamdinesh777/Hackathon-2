import java.util.Scanner;

class MovieTicket {
    // Data members
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    // Parameterized constructor
    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Method to calculate total ticket amount
    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    // Method to calculate discount (10% if tickets >= 5)
    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0.0;
    }

    // Method to calculate final amount after discount
    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    // Method to display the complete booking bill
    public void displayBill() {
        System.out.println("Movie Name: " + movieName);
        System.out.printf("Ticket Price: %.2f\n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Discount: %.2f\n", calculateDiscount());
        System.out.printf("Final Amount: %.2f\n", calculateFinalAmount());
    }
}

public class Movie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input values from the user
        String movieName = scanner.nextLine();
        double ticketPrice = scanner.nextDouble();
        int numberOfTickets = scanner.nextInt();

        // Creating MovieTicket object using the constructor
        MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);

        // Explicitly invoking the required calculation methods as per instruction
        ticket.calculateTotal();
        ticket.calculateDiscount();
        ticket.calculateFinalAmount();

        // Displaying the complete booking bill
        ticket.displayBill();

        scanner.close();
    }
}