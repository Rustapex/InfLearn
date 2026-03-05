package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; //1.5 인데 int 라서 1
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2; // 1.5
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2; // 1.5
        System.out.println("div3 = " + div3);

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4);

        int a=3;
        int b=2;
        double result = (double) a/b;
        System.out.println("result = " + result);

        /*
        * 같은 타입끼리 연산 같은 타입의 결과
        * 서로 다른 타입의 계산은 큰 범위로 자동 형변환
        * */

    }
}
