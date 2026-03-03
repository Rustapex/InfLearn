package Operator.ex;
import java.util.Scanner;

public class OperationEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        int score = Integer.parseInt(sc.nextLine());
        boolean result = ((score >= 80)&&(score <= 100));

        System.out.println("80점 이상이라면 true, 아니면 false입니다.");
        System.out.println(result);



    }
}
