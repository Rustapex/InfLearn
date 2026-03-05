package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.printf("%s\n%s %d\n%s %d\n", "현재 값", "a = ", a, "b = ", b);
        int temp;
        temp = b;
        b = a;
        a = temp;
        System.out.printf("%s\n%s %d\n%s %d", "바뀐 값", "a = ", a, "b = ", b);

        /*
        * a= a+b;
        * b = a-b;
        * a = a-b; // 이렇게 temp 없이 교환 가능, 곱하고 나눗셈도 가능한데, 0들어가면 x
        *
        * XOR 사용 (A,B,A^B) = (0,0,0) = (0,1,1) = (1,0,1) = (1,1,0)
        * a = a ^ b;
        b = a ^ b; // (a^b)^b = a
        a = a ^ b; // (a^b)^a = b
        * */
    }
}
