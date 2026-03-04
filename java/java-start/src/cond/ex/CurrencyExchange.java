package cond.ex;
import java.util.*;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dollar = Integer.parseInt(sc.nextLine());
        String resMes;
        int wonAmount=0;

        if(dollar <0){
            resMes = "잘못된 금액입니다.";
        } else if(dollar ==0){
            resMes = "환전할 금액이 없습니다.";
        } else{
            wonAmount = dollar * 1300;
            resMes = "환전 금액은 " + wonAmount + "원입니다.";
        }
        System.out.println("dollar: " + dollar);
        System.out.println(resMes);


    }
}
