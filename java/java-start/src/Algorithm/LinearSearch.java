package Algorithm;
/*배열 안에 30이 있는지 찾는 코드*/

public class LinearSearch {
    public static void main(String[] args) {
        int[] FindTty= {1,3,5,30,80,23,45,34,80,90};

        int target = 30;
        boolean found = false;
        int index = -1;

        for(int i=0; i<FindTty.length; i++){
            if(target == FindTty[i]){
                found = true;
                index = i;
                break;
            }
        }
        if(found){ // found == true 와 같은 의미
            System.out.printf("배열의 index : %d에서 %d를 찾았습니다.%n", index, target);
        } else{
            System.out.printf("배열에서 %d를 찾지 못했습니다.%n", target);
        }


    }
}
