public class Movie {

    private String title;
    private String genre;
    private int duration;
    private String showTime;

    public Movie(String title, String genre, int duration, String showTime) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.showTime = showTime;
    }

    public void displayMovie() {
        System.out.println("\nMovie Information");
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Show Time: " + showTime);
        System.out.println();
    }
}