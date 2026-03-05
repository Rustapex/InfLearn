package scanner.ex;
import java.util.*;

public class ScannerEx4 {
    static class GuguRow{
        int dan, i, product;

        GuguRow(int dan, int i, int product){
            this.dan = dan;
            this.i = i;
            this.product = product;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단의 단 수를 입력해주세요: ");
        int dan = Integer.parseInt(sc.nextLine());

        ArrayList<GuguRow> danMul = new ArrayList<>();

        for(int i=1; i<10; i++){
            danMul.add(new GuguRow(dan, i, dan*i));
        }

        for(GuguRow row : danMul){
            System.out.printf("%d * %d = %d\n", row.dan, row.i, row.product);
        }


    }
}
