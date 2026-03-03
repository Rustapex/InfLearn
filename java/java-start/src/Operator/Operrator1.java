package Operator;

public class Operrator1 {
    public static void main(String[] args) {

        //변수 초기화
        int a=5, b =2; // 0으로는 나눌 수 없다.

        //덧셈
        int sum = a+b;
        System.out.println("a+b = " + sum);

        //뺄셈
        int diff = a-b;
        System.out.println("a-b = " + diff);

        //곱셈
        int multi = a*b;
        System.out.println("a*b = " + multi);

        //나눗셈
        int div = a/b;
        System.out.println("a/b = " + div); // int라서 2

        //나머지
        int mod = a%b;
        System.out.println("a%b = " + mod);



    }
}
