package scanner;

import java.util.*;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.println("num1 = " + num1);

        System.out.print("두번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + "+" + num2 + "= " + (num1 + num2));


        int max = (num1 >= num2) ? num1 : num2;
        if(num1 == num2){
            System.out.println("두 숫자는 같습니다.");
        }
        System.out.println("더 큰 숫자 :  " + max);

    }
}
