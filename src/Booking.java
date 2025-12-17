public class Booking {
    private int bookingId;
    private Customer customer;
    private Movie movie;
    private Ticket ticket;

    public Booking(int bookingId, Customer customer, Movie movie, Ticket ticket) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.movie = movie;
        this.ticket = ticket;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void displayBookingInfo() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println(customer);
        System.out.println(movie);
        System.out.println(ticket);
    }
}

