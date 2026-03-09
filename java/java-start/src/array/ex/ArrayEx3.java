package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("5개의 정수를 입력하세요:");

        int arrLth = numbers.length;

        for (int i = 0; i < arrLth; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력:");
        for (int i = (arrLth-1); i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }

        }
        System.out.println();

        System.out.println("입력한 정수를 크기순 내림차순으로 출력:");

        /*i=0 j=1,2,3
        * i=1 j=2,3
        * i=2 j=3,*/
        for(int i=0; i<arrLth; i++){
            for(int j=i+1; j< arrLth; j++){
                if(numbers[i] < numbers[j]){
                    /*더 큰값을 앞 index로*/
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }
        for(int i=0; i<arrLth; i++){
            System.out.print(numbers[i]);
            if(i < arrLth-1){
                System.out.print(", ");
            }

        }
        sc.close();


    }
}
