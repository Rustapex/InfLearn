package Operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = str1.equals(str2);
        boolean result2 = "hello".equals("hello");

        System.out.println(result1);
        System.out.println(result2);
//        System.out.println("hello" =="hello");
//        이렇게 쓰면 안돼, 특정 조건일 때는 제대로 반환 x

    }
}
