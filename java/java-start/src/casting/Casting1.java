package casting;

public class Casting1 {
    static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        // 큰범위에 작은범위 대입 가능하다 double > long > int
        longValue = intValue; //(long) intValue -> 자동 형변환
        System.out.println("LongValue : " + longValue);
        doubleValue = intValue; //(double) intValue
        System.out.println("doubleVlaue : " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleVlaue2 : " + doubleValue);


    }
}
