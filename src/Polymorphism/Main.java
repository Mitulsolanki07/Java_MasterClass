package Polymorphism;

import java.sql.SQLClientInfoException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] arg) {
        Movie movie = new Movie("StarWars");
        movie.WatchMovie();
        Movie adventure = new Adventure("Avatar");
        adventure.WatchMovie();
        Movie factoryMethodDesign = Movie.getMovie("Z", "Milky Galaxy");
        factoryMethodDesign.WatchMovie();

        Object newObj = Movie.getMovie("S", "Star Wars");
        ScienceFiction typeCastObj = (ScienceFiction) newObj;
        typeCastObj.ScienceFictionMovie();

        var unkownObj = Movie.getMovie("A", "ChildClass");
        unkownObj.WatchMovie();
        System.out.println("unkownObj.getClass().getSimpleName() " + unkownObj.getClass().getSimpleName());
        if (unkownObj.getClass().getSimpleName().equals("Comedy")) {
            System.out.println("--------Comedy--------");
            Comedy typeVarObj = (Comedy) unkownObj;
            typeVarObj.watchComedy();
        } else if (unkownObj.getClass().getSimpleName().equals("Adventure")) {
            System.out.println("--------Adventure--------");
            Adventure typeVarObj = (Adventure) unkownObj;
            typeVarObj.WatchAdventure();
        } else if (unkownObj instanceof ScienceFiction) {
            System.out.println("--------ScienceFiction--------");
            ((ScienceFiction) unkownObj).ScienceFictionMovie();
        } else {
            System.out.println("--------Movie--------");
            Movie typeVarObj = (Movie) unkownObj;
            typeVarObj.WatchMovie();
        }


        System.out.println(unkownObj.getClass().getSimpleName());

//        Scanner sc = new Scanner(System.in);
//        while(true){
//            System.out.print("Enter Type (Select 'A' for Adventure , 'C' for Comedy, 'S' for ScienceFiction, & 'Q' for Quit): ");
//            String type = sc.nextLine();
//            if("qQ".contains(type)){
//                break;
//            }
//            else{
//                System.out.print("Enter Movie title: ");
//                String title = sc.nextLine();
//                Movie theMovie = Movie.getMovie(type, title);
//                theMovie.WatchMovie();
//            }
//        }


    }
}
