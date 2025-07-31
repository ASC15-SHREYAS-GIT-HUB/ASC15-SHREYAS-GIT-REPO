package com.demo.labs.lab3;
public class MovieDemo {
    public static void main(String[] args) {
        Movie m1 = new Movie("Inception", "Legendary Pictures");
        m1.acceptDetails("Christopher Nolan", 2.8, 2010, "Sci-fi");
        System.out.println(m1.showDetails());
        System.out.println("Movie ID: " + m1.getMovieId());
        System.out.println("Total Movies: " + Movie.getMoviesCount());
        System.out.println("---------------");

        SpecialMovie sm = new SpecialMovie("Avatar", "20th Century Fox", "Dolby Atmos", "CGI");
        sm.acceptDetails("James Cameron", 3.0, 2009, "Fantasy");
        System.out.println(sm.showSpecialDetails());
        System.out.println("---------------");

        InternationalMovie im = new InternationalMovie("Parasite", "Barunson E&A", "South Korea", "Korean");
        im.acceptDetails("Bong Joon-ho", 2.2, 2019, "Thriller");
        System.out.println(im.showInternationalDetails());
        System.out.println("Total Movies: " + Movie.getMoviesCount());
    }
}
