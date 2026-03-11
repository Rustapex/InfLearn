package loop.ex;

public class whileEx3 {
    public static void main(String[] args) {
        int sum=0;
        int max = 100;

        for(int i=1; i<= max; i++){
            sum += i;
        }
        System.out.println(sum);

        int j=1;
        int sum2 = 0;

        while(j <= max){
            sum2 += j;
            j++;
        }
        System.out.println(sum2);
    }
}
