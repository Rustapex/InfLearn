package Algorithm;
import java.util.*;

public class MaxValueBasic {
    public static void main(String[] args) {
        int[] scores = {75, 92, 88, 64, 99};

        int max=scores[0];

        for(int i=1; i<scores.length; i++){
            if(max <= scores[i]){
                max = scores[i];
            }
        }
        System.out.println(Arrays.toString(scores));
        System.out.printf("최댓값 : %d%n", max);

    }
}
