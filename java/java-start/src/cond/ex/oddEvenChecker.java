package cond.ex;

import java.util.*;

public class oddEvenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s", "x: ");
        int x = Integer.parseInt(sc.nextLine());
        String isEven = (x % 2 == 0) ? "짝수" : "홀수";


        System.out.println("출력: x = " + x + ", " + isEven);
        sc.close();
    }
}
