package loop;

public class While2_1 {
    public static void main(String[] args) {
        // sum =0 고정, i = (시작값), endNum(끝값) i~endNum까지 합을 sum에 반환
        int sum =0;
        int i=1;
        int endNum =3;

        // sum =0 while문 sum = 0 + 1 =1, i=2 / sum=1 sum = 1 +2 = 3, i=3
        while( i<= endNum){
            sum += i;
            System.out.println("i =" + i + " sum = " + sum);
            i++;
        }

    }
}
