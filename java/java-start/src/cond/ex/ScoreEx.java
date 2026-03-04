package cond.ex;
import java.util.*;

public class ScoreEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = Integer.parseInt(sc.nextLine());
        String result;

        if(score > 90){
            result = "A";
        } else if(score > 80){
            result = "B";
        } else if(score > 70){
            result = "C";
        } else if(score > 60){
            result = "D";
        } else{
            result = "F";
        }

        System.out.println("score: " + score);
        System.out.println("출력: 학점은 " + result + "입니다.");

    }
}
