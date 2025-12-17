public class Ticket {
    private int ticketId;
    private double price;
    private String seatNumber;

    public Ticket(int ticketId, double price, String seatNumber) {
        this.ticketId = ticketId;
        this.price = price;
        this.seatNumber = seatNumber;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + ticketId +
                ", price=" + price +
                ", seat='" + seatNumber + '\'' +
                '}';
    }
}
