package Algorithm;

import java.util.Arrays;

public class ReverseArrayBasic {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr));
        /*0 = 4  1 = 3 2 = 2 */
        for (int i=0; i<(arr.length/2); i++) {
            swap(arr, i, arr.length-i-1);
        }
        System.out.print("반대 순서대로 출력\n");
        System.out.println(Arrays.toString(arr));


    }
    public static void swap(int[] arr, int index1, int index2){
        int temp;
        temp =arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return;
    }
}
