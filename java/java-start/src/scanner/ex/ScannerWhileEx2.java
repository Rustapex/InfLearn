package scanner.ex;
import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int goodsPrice, goodsCnt, totalPrice;
        while(true){
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료): ");
            goodsPrice = Integer.parseInt(sc.nextLine());
            if(goodsPrice == -1){
                System.out.print("프로그램을 종료합니다.");
                break;
            }
            System.out.print("구매하려는 수량을 입력하세요: ");
            goodsCnt = Integer.parseInt(sc.nextLine());

            totalPrice = goodsPrice * goodsCnt;
            System.out.printf("총 비용 : %d\n", totalPrice);


        }

        sc.close();





    }
}
