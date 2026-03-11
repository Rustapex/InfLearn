package loop.ex;
import java.util.*;

public class NestedEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s", "rows = ");
        int rows = Integer.parseInt(sc.nextLine());

        for(int i=1; i<= rows; i++){
            for(int j=1; j<=i ;j++){
                System.out.printf("%s", "*");
            }
            System.out.println();
        }

    }
}
