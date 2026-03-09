package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int inputCnt = sc.nextInt();
        int sum =0;
        double avg;

        int[] numbers = new int[inputCnt];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        for (int number : numbers) {
            sum += number;
        }
        avg = (double) sum / numbers.length;

        System.out.printf("입력한 정수의 합계: %d\n", sum);
        System.out.printf("입력한 정수의 평균: %.1f\n", avg);



    }
}
