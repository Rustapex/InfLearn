package Operator;

public class OperatorAdd2 {
    static void main(String[] args) {
        int a=1;
        int b=0;

        //전위
        b= ++a; // a = a+1 , b=a = 2
        System.out.println("a = " + a + ", b =  " + b);

        //후위
        a=1; b=0;

        b= a++; // b=a = 1 , a = a+1 = 2
        System.out.println("a = " + a + ", b =  " + b);

        ++a;
        System.out.println("++a : " + a);
        a++;
        System.out.println("a++ : " + a);

    }
}
