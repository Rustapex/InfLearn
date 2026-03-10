package Algorithm;

/*버블 정렬 : 작은 값이 배열 앞에 위치한다
 *  작 < 큰 순으로 정렬*/

import java.util.Arrays;

public class SortBasic2 {
    public static void main(String[] args) {
        int[] numArr = {5, 11, 3, 2, 9, 10, 12, 4, 1, 6, 7, 8};

        System.out.println("바뀌기 전 배열");
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length - 1; i++) {
            for (int j = 0; j < numArr.length - 1-i; j++) {
                if (numArr[j] > numArr[j + 1]) {
                    swap(numArr, j, (j + 1));
                }
            }
        }
        /* i=0      swap이후
        j=0  0vs 1  0 < 1
        j=1 1 vs 2  1 <2
        j=2 2 vs 3  2<3
        ...
        j=10 10 vs 11(0번재 반복 최댓값) 10 < 11

        i=1
        j=0  0vs 1  0 < 1
        j=1 1 vs 2  1 < 2
        j=2 2 vs 3  2 < 3
        ...
        j=9 9 vs 10(1번재 반복 최댓값) 9 < 10
        */


        System.out.println("정렬 이후 배열");
        System.out.println(Arrays.toString(numArr));

        System.out.printf("최댓값 : %d, 최솟값 : %d", numArr[numArr.length - 1], numArr[0]);
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return;
    }

}
