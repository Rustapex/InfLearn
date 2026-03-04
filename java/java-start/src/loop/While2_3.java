package loop;

public class While2_3 {
    public static void main(String[] args) {
        int i=10;

//      do-while문 do {명령1} while(조건);
//      무조건 do{} 한번 돌기, 그리고 while 조건 확인 후 반복 결정
//      사용자 입력을 최소 한번 받고 올바를 때까지 다시 입력받기
        do{
            System.out.println("혆재 숫자는 : " + i);
            i++;

        } while(i<3);

    }
}
