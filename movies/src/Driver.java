import Movies.Movie;
import Movies.MovieTheatre;
import org.w3c.dom.ls.LSOutput;

import java.lang.*;
import java.sql.SQLOutput;

public class Driver {
    public static void main(String[] args) {

        String movieName="ABCD";
        int movieYear=2010;
        double movieDuration=200;

        Movie movieobject = new Movie(movieName, movieYear, movieDuration);

        System.out.println(movieobject.toString());

        System.out.println(longMovie(movieobject));


        MovieTheatre newObj = new MovieTheatre();

        System.out.println("All movies: " + newObj.getMovie1() + " | " + newObj.getMovie2() + " | " +newObj.getMovie3() + " | Theater Name: " + newObj.getTheaterName());


    }

    public static boolean longMovie(Movie obj) {
        if (obj.getDurationMinutes() > 150){
            return true;
        }
        else return false;
    }





}