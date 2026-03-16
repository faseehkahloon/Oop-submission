import java.util.Scanner;

public class Screen {

    private String screenID;
    private String screenType;
    private Movie movie;
    private Seat[][] seats;

    public Screen(String screenID, String screenType, int rows, int cols) {

        this.screenID = screenID;
        this.screenType = screenType;

        seats = new Seat[rows][cols];

        int seatID = 1;

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                String type;
                double price;

                if(i == 0)
                {
                    type = "VIP";
                    price = 1200;
                }
                else if(i == 1 || i == 2)
                {
                    type = "Premium";
                    price = 800;
                }
                else
                {
                    type = "Regular";
                    price = 500;
                }

                seats[i][j] = new Seat(seatID++, i+1, type, price);
            }
        }
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void displaySeats() {

        System.out.println("Seat Layout");

        for(int i = 0; i < seats.length; i++) {

            for(int j = 0; j < seats[i].length; j++) {

                System.out.print(seats[i][j].getSeatID() + " ");
            }

            System.out.println();
        }
    }

    public void selectSeat() {

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter Seat ID: ");
        int id = input.nextInt();

        for(int i = 0; i < seats.length; i++) {

            for(int j = 0; j < seats[i].length; j++) {

                if(seats[i][j].getSeatID() == id) {

                    System.out.println("\nSeat Information");
                    seats[i][j].displaySeat();

                    movie.displayMovie();
                    return;
                }
            }
        }

        System.out.println("Invalid Seat ID");
    }
    public void displayScreen(){
        System.out.println("Screen ID: " + screenID + " | Type: " + screenType + "\n");}
}