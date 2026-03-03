package Operator;

public class OperatorAdd1 {
    static void main(String[] args) {
        int a = 0;

        a += 1;
        System.out.println("a  = " +a);

        a = a + 1;
        System.out.println("a  = " +a);

        //증감 연산자
        ++a; // a = a+1; 3
        System.out.println("a  = " +a);
        ++a; // a = a+1; 4
        System.out.println("a  = " +a);
    }
}
