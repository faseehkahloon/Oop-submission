public class Demo {

    public static void main(String[] args) {

        Company company = new Company("CineWorld",2);

        Branch branch1 = new Branch("Cinepex","Lahore","Mall Road",2);
        Branch branch2 = new Branch("CinemaPlus","Multan","DHA Multan",1);

        Movie movie1 = new Movie("Avengers","Action",180,"6:00 PM");
        Movie movie2 = new Movie("Batman","Action",170,"9:00 PM");
        Movie movie3 = new Movie("Interstellar","SCIFI",169,"11:00 PM");

        Screen screen1 = new Screen("Screen 1","IMAX",5,5);
        Screen screen2 = new Screen("Screen 2","3D",5,5);
        Screen screen3 = new Screen("Screen 3","IMAX",5,5);

        screen1.setMovie(movie1);
        screen2.setMovie(movie2);
        screen3.setMovie(movie3);

        branch1.addScreen(0,screen1);
        branch1.addScreen(1,screen2);
        branch2.addScreen(0,screen3);

        company.addBranch(0,branch1);
        company.addBranch(1,branch2);

        company.displayCompany();

        screen1.displaySeats();
        screen1.selectSeat();

        screen2.displaySeats();
        screen2.selectSeat();

        screen3.displaySeats();
        screen3.selectSeat();
    }
}