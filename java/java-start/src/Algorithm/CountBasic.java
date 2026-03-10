package Algorithm;

import java.util.Arrays;

public class CountBasic {
    public static void main(String[] args) {
        int[] nums = {3, 8, 10, 5, 12, 7};
        int evenCount =0;

        for (int num : nums) {
            if(num %2 ==0){
                evenCount++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.printf("짝수는 %d개 입니다%n", evenCount);

    }
}
