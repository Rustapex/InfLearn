package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        int i=1;
        for(int row =0; row < arr.length; row++){
            for(int column =0; column < arr[row].length; column++){
                arr[row][column] = i++;
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = (i+1) * (j+1);
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }

        /*System.out.println(Arrays.deepToString(arr));*/



    }
}
