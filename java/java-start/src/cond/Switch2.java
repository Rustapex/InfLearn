package cond;
import java.util.Scanner;

public class Switch2 {
    static void main(String[] args) {
        int grade= 2;

        int coupon;
        switch (grade){
            case 1:
                coupon = 1000; break;
            case 2:
                coupon = 2000; break;
            case 3:
                coupon = 3000; break;
            default:
                coupon = 500;
        }
        System.out.println("발급 받은 쿠폰 " + coupon);

        {
            Scanner sc = new Scanner(System.in);
            System.out.println("grade :");
            int grade2 = Integer.parseInt(sc.nextLine());

            int coupon2 = switch (grade2){
                case 1 -> {
                    System.out.println("vip");
                    yield 1000;
                }
                case 2 -> {
                    System.out.println("gold");
                    yield 2000;
                }
                case 3 -> {
                    System.out.println("silver");
                    yield 3000;
                }
                default -> 500;
            };
            System.out.println("coupon : " + coupon2);
            sc.close();

        }
    }
}
