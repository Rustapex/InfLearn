package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0, cnt = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");

        do {
            num = Integer.parseInt(sc.nextLine());
            if (num == -1) {
                break;
            }
            cnt++;
            sum += num;
        } while (true);

        double avg = (double) sum / cnt;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.printf("입력한 숫자들의 평균: %.1f", avg);

        sc.close();
    }
}
