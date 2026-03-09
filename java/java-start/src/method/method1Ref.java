package method;

public class method1Ref {
    public static void main(String[] args) {
        int a1 = 2, b1 = 3;
        System.out.printf("%d + %d = %d", a1,b1,add(a1,b1));


    }

    /*add method*/
    public static int add(int a, int b) {
        System.out.printf("%d + %d 연산 수행%n", a,b);
        int sum = a+b;
        return sum;

    }
}
