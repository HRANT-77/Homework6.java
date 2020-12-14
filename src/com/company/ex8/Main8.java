package com.company.ex8;

import java.util.Random;

public class Main8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ratArr = new int[10];
        String[] filmTitle = new String[10];
        int index = 0;
        //region Create movie object
        Movie movie0 = new Movie();
        movie0.setTitle("Parasite");
        movie0.setRating(random.nextInt(11));
        ratArr[0] = movie0.getRating();
        filmTitle[0] = "Parasite";

        Movie movie1 = new Movie();
        movie1.setTitle("The Irishman");
        movie1.setRating(random.nextInt(11));
        ratArr[1] = movie1.getRating();
        filmTitle[1] = "The Irishman";

        Movie movie2 = new Movie();
        movie2.setTitle("Knives out");
        movie2.setRating(random.nextInt(11));
        ratArr[2] = movie2.getRating();
        filmTitle[2] = "Knives out";

        Movie movie3 = new Movie();
        movie3.setTitle("Metropolis");
        movie3.setRating(random.nextInt(11));
        ratArr[3] = movie3.getRating();
        filmTitle[3] = "Metropolis";

        Movie movie4 = new Movie();
        movie4.setTitle("Iron Man");
        movie4.setRating(random.nextInt(11));
        ratArr[4] = movie4.getRating();
        filmTitle[4] = "Iron Man";

        Movie movie5 = new Movie();
        movie5.setTitle("Harry Potter");
        movie5.setRating(random.nextInt(11));
        ratArr[5] = movie5.getRating();
        filmTitle[5] = "Harry Potter";

        Movie movie6 = new Movie();
        movie6.setTitle("Peaky Blinders");
        movie6.setRating(random.nextInt(11));
        ratArr[6] = movie6.getRating();
        filmTitle[6] = "Peaky Blinders";

        Movie movie7 = new Movie();
        movie7.setTitle("Mafia");
        movie7.setRating(random.nextInt(11));
        ratArr[7] = movie7.getRating();
        filmTitle[7] = "Mafia";

        Movie movie8 = new Movie();
        movie8.setTitle("Forsage");
        movie8.setRating(random.nextInt(11));
        ratArr[8] = movie8.getRating();
        filmTitle[8] = "Forsage";

        Movie movie9 = new Movie();
        movie9.setTitle("Transporter");
        movie9.setRating(random.nextInt(11));
        ratArr[9] = movie9.getRating();
        filmTitle[9] = "Transporter";
//endregion

        //region Sout all ratings
        System.out.println(movie0.getTitle() + "-" + movie0.getRating());
        System.out.println(movie1.getTitle() + "-" + movie1.getRating());
        System.out.println(movie2.getTitle() + "-" + movie2.getRating());
        System.out.println(movie3.getTitle() + "-" + movie3.getRating());
        System.out.println(movie4.getTitle() + "-" + movie4.getRating());
        System.out.println(movie5.getTitle() + "-" + movie5.getRating());
        System.out.println(movie6.getTitle() + "-" + movie6.getRating());
        System.out.println(movie7.getTitle() + "-" + movie7.getRating());
        System.out.println(movie8.getTitle() + "-" + movie8.getRating());
        System.out.println(movie9.getTitle() + "-" + movie9.getRating());
//endregion

        //region max element ratArr
        int max = ratArr[0];
        for (int i = 1; i < ratArr.length; i++) {
            if (ratArr[i] > max) {
                max = ratArr[i];
            }
        }
        //endregion

        System.out.println();
        System.out.print("Best films : ");
        for (int i = 0; i < ratArr.length; i++) {
            if(ratArr[i]==max){
                System.out.print(filmTitle[i]+"-"+ratArr[i]+" ");
            }
        }
    }
}
