import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie(1, "Inception", "Sci-Fi", 148);
        Movie movie2 = new Movie(2, "Harry Potter", "Drama", 195);

        Customer customer = new Customer(1, "Ainur", "ainur@mail.com");

        Ticket ticket1 = new Ticket(101, 2500, "A10");
        Ticket ticket2 = new Ticket(102, 3000, "B5");

        Booking booking1 = new Booking(1, customer, movie1, ticket1);
        Booking booking2 = new Booking(2, customer, movie2, ticket2);

        booking1.displayBookingInfo();
        System.out.println();
        booking2.displayBookingInfo();
