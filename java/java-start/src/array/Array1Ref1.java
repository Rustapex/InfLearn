package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students = new int[]{90, 80, 70, 60, 50}; // 배열의 생성과 초기화

        /* 1번
        int[] students
        students = new int[5]
        students[0] = 90;
        ...
        students[4] = 50;

        */

        /*2번
        * int[] students;
        * students = new int[]{90,80,70,60,50}
        * */

        /*3번
        * int[] students = new int[]{90,80,70,60,50}*/

        /*4번
        * int[] students = {90,80,70,60,50}*/
        for (int i = 0; i < students.length; i++) {
            System.out.println("student" + (i + 1) + " = " + students[i]);
        }


    }
}
