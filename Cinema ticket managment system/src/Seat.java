public class Seat {

    private int seatID;
    private int rowNumber;
    private String seatType;
    private double price;

    public Seat(int seatID, int rowNumber, String seatType, double price) {
        this.seatID = seatID;
        this.rowNumber = rowNumber;
        this.seatType = seatType;
        this.price = price;
    }

    public int getSeatID() {
        return seatID;
    }

    public void displaySeat() {
        System.out.println("Seat ID: " + seatID +
                " | Row: " + rowNumber +
                " | Type: " + seatType +
                " | Price: " + price);
    }
}