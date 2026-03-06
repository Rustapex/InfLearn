package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        int totalPrice = 0;


        loop:
        do {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> {
                    System.out.print("상품명: ");
                    String itemName = sc.nextLine();
                    System.out.print("상품 가격: ");
                    int price = Integer.parseInt(sc.nextLine());
                    System.out.print("상품 수량: ");
                    int quantity = Integer.parseInt(sc.nextLine());

                    totalPrice += (price * quantity);

                    System.out.printf("상품명: %s, 가격: %d, 수량: %d, 합계: %d\n"
                            , itemName, price, quantity, price * quantity);
                }
                case 2 -> {
                    System.out.printf("총 비용: %d\n", totalPrice);
                    totalPrice = 0;
                }
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    break loop;
                }
                default -> System.out.println("올바른 옵션을 선택해주세요.");
            }

        } while (true);
        sc.close();
    }

}
