package Algorithm;

import java.util.Arrays;

public class SumAvgBasic {
    public static void main(String[] args) {
        int[] scores = {80, 90, 100, 70, 60};
        int sum=0;
        double avg;

        for(int i=0; i<scores.length; i++){
            sum += scores[i];
        }
        avg = (double) sum / scores.length;

        System.out.println(Arrays.toString(scores));
        System.out.printf("배열 요소의 총합 : %d, 평균 : %.3f ", sum, avg);


    }
}
