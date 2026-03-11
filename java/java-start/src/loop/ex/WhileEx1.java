package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        int count = 10;
        int i = 1;

        while (i < (count + 1)) {
            System.out.println(i);
            i++;
        }

        System.out.println("\n");

        for (int j = 1; j <= count; j++) {
            System.out.println(j);
        }
    }
}
