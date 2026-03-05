package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; int < double 이므로 대입x
        intValue = (int) doubleValue; // 명시적 형변환
        System.out.println(intValue); // 소수점 버림


    }
}
