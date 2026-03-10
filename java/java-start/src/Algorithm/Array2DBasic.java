package Algorithm;

public class Array2DBasic {
    public static void main(String[] args) {
        int[][] scores = {
                {90, 80, 70},
                {100, 95, 85},
                {60, 75, 88}
        };

        /*행 합계 구하기*/

        for(int i=0; i<scores.length; i++){
            int rowSum =0;
            for(int j=0; j<scores[i].length; j++){
                rowSum += scores[i][j];
            }
            System.out.printf("%d번째 합계 : %d%n", (i+1), rowSum);
        }

    }
}
