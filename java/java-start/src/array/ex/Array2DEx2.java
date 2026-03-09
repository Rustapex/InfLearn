package array.ex;

import java.util.Scanner;

public class Array2DEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int stuCnt = sc.nextInt();
        int[][] stuGrade = new int[stuCnt][3];
        String[] subjects = new String[]{"국어", "영어", "수학"};

        int[] total = new int[stuCnt];
        double[] avg = new double[stuCnt];

        for (int i = 0; i < stuCnt; i++) {
            System.out.printf("%d번 학생의 성적을 입력하세요:%n", (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.printf("%s 점수: ", subjects[j]);
                stuGrade[i][j] = sc.nextInt();
                total[i] += stuGrade[i][j];
            }
            avg[i] = (double) total[i] / stuGrade[i].length;
        }

        for (int i = 0; i < stuGrade.length; i++) {
            System.out.printf("%d번 학생의 총점: %d, 평균: %.1f%n", i + 1, total[i], avg[i]);
        }

        System.out.println();


    }
}
