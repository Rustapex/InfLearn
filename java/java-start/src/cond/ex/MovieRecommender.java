package cond.ex;

import java.util.*;


public class MovieRecommender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rating = Double.parseDouble(sc.nextLine());

        Movie[] movies = {
                new Movie("어바웃타임", 9.0),
                new Movie("토이 스토리", 8.0),
                new Movie("고질라", 7.0)
        };

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].rating >= rating) {
                if (!(i == 0)) {
                    System.out.println("'" + movies[i].title + "'" + "를 추천합니다.");
                    continue;
                }
                System.out.println("'" + movies[i].title + "'" + "을 추천합니다.");

            }

        }


    }

    static class Movie {
        String title;
        double rating;

        Movie(String title, double rating) {
            this.title = title;
            this.rating = rating;
        }
    }
}
