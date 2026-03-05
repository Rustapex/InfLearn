package scanner.ex;
import java.util.*;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("하나의 정수를 입력하세요: ");
        int num = Integer.parseInt(sc.nextLine());
        String res;

        if(num%2 ==0){
            res = "짝수";
        } else{
            res = "홀수";
        }
        System.out.println("입력한 숫자 " + num +"는 " + res + "입니다");

    }
}
