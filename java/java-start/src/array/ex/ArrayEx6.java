package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int inputCnt = sc.nextInt();
        int max, min;

        System.out.printf("%d개의 정수를 입력하세요:\n", inputCnt);
        int[] numbers = new int[inputCnt];

        for (int i = 0; i < inputCnt; i++) {
            numbers[i] = sc.nextInt();
        }

        /*i=0 j=1 j=2 ... j=마지막
         * i=1 j=2 j=3 ....
         * ...
         * i=(마지막-1) j= 마지막 */
        for (int i = 0; i < (inputCnt - 1); i++) {

            for(int j=i+1; j< inputCnt; j++){
                if(numbers[i] < numbers[j]){
                    /*더 큰값을 앞 index로*/
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }
        max = numbers[numbers.length-1];
        min = numbers[0];

        System.out.printf("가장 작은 정수: %d\n", min);
        System.out.printf("가장 큰 정수: %d\n", max);

        sc.close();
    }
}
