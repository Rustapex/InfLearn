package cond.ex;

import java.util.*;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        int max = (a >= b) ? a : b;
        System.out.println("더 큰 숫자는 " + max + "입니다.");
        sc.close();
    }
}
