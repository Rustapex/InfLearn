package Algorithm;

import java.util.Arrays;

public class ReverseArrayBasic2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr));
        /*0 = 4  1 = 3 2 = 2 */
        for (int i=0; i<(arr.length/2); i++) {
            int temp;
            int changeVal = arr.length-i-1;
            temp = arr[i];
            arr[i] = arr[changeVal];
            arr[changeVal] = temp;
        }
        System.out.print("반대 순서대로 출력\n");
        System.out.println(Arrays.toString(arr));


    }

}
