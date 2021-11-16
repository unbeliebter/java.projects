package bwinf2021.hotel;

public class Hotel {

    public static int kilometer;
    public static double rating;

    public void Hotel(int kilometer, double rating) {
        this.kilometer = kilometer;
        this.rating = rating;
    }

    public static void setKilometer(int kilometer) {
        Hotel.kilometer = kilometer;
    }

    public static void setRating(double rating) {
        Hotel.rating = rating;
    }

    public static double getRating() {
        return rating;
    }

    public static int getKilometer() {
        return kilometer;
    }
}
