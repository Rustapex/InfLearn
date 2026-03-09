package array.ex;

import java.util.Scanner;

public class ArrayEx6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int inputCnt = sc.nextInt();
        int max, min;

        System.out.printf("%d개의 정수를 입력하세요:%n", inputCnt);
        int[] numbers = new int[inputCnt];

        for (int i = 0; i < inputCnt; i++) {
            numbers[i] = sc.nextInt();
        }
        min = numbers[0];
        max = min;

        for (int number : numbers) {
            if (min >= number) {
                min = number;
            }
            if (max <= number) {
                max = number;
            }
        }

        System.out.printf("가장 작은 정수: %d\n", min);
        System.out.printf("가장 큰 정수: %d\n", max);

        sc.close();

    }
}