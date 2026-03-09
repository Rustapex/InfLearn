package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[i].length; y++) {
                arr[x][y] = (x + 1) * (y + 1);
                System.out.println(arr[x][y] + " ");
            }
            System.out.println();
        }

        /*System.out.println(Arrays.deepToString(arr));*/


    }
}
