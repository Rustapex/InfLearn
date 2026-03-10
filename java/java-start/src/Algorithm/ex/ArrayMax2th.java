package Algorithm.ex;

/*정수 7개가 들어 있는 배열이 있다.
가장 큰 수 말고, 두 번째로 큰 수를 구해서 출력하시오.*/

public class ArrayMax2th {
    public static void main(String[] args) {
        int[] num = {8, 3, 15, 6, 10, 2, 19};
        int max = num[0];
        int maxIdx=0;


        for(int i=0; i<num.length; i++){
            if(max < num[i]){
                max = num[i];
                maxIdx =i;
            }

        }



    }
}
