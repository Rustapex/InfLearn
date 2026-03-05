package method.String;

import java.util.*;

public class ComparisionAndDicision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("비교/판단을 할 method를 입력하세요 :");
        System.out.print("equlas(EQ) / equalsIgnoreCase(EIC) / contains(CT) \n startsWith / endsWith(SE)  \n isEmpty(IE) isBlank(IB) (Java 11+)  ");
        String inputStr = sc.nextLine();

        String comparStr = "abcdefgh";
        System.out.println("비교할 문자열은 " + comparStr + "입니다.");

        switch (inputStr) {
            case "EQ" -> {
                System.out.println("equlas : 두 문자열이 같은지 비교");
                if (comparStr.equals("a")) { // comparStr 과 "a" 가 같은지 비교
                    System.out.println("a와 같습니다");
                } else {
                    System.out.println(inputStr + " != " +  "a");
                }
            }
            case "EIC" -> {
                System.out.println("equalsIgnoreCase(EIC) : equlas + 대소문자 구분 x");
                if (comparStr.equalsIgnoreCase("ABCDEFGH")) {
                    System.out.println(comparStr + " == " + "ABCDEFGH");
                }

            }
            case "CT" -> {
                System.out.println("contains(CT) : 특정 문자열(부분문자열)이 포함되어 있는지");
                if (comparStr.contains("bcd")) {
                    System.out.println("bcd 문자열이 안에 있습니다.");
                } else {
                    System.out.println("bcd 문자열이 안에 없습니다.");
                }
            }
            case "SE" -> {
                System.out.println("startsWith / endsWith(SE) : 접두/접미 검사");

                if (comparStr.startsWith("abc")) {
                    System.out.println("abc로 시작합니다.");
                } else {
                    System.out.println("abc로 시작하지 않습니다.");
                }

                if (comparStr.endsWith("fgh")) {
                    System.out.println("fgh로 끝납니다.");
                } else {
                    System.out.println("fgh로 끝나지 않습니다.");
                }
            }
            case "IE" -> {
                System.out.println("isEmpty(IE) : 문자열 길이가 0(\" \")인지 확인");

                if (comparStr.isEmpty()) {
                    System.out.println("comparStr는 비어있습니다.");
                } else {
                    System.out.println("comparStr는 비어있지 않습니다.");
                }

                String emptyStr = "";
                if (emptyStr.isEmpty()) {
                    System.out.println("\"\" 는 isEmpty() = true");
                }
            }

            case "IB" -> {
                System.out.println("isBlank(IB) (Java 11+) : 공백만 있어도 비었다고 판단");

                if (comparStr.isBlank()) {
                    System.out.println("comparStr는 blank 입니다.");
                } else {
                    System.out.println("comparStr는 blank가 아닙니다.");
                }

                String blankStr = "   ";
                if (blankStr.isBlank()) {
                    System.out.println("\"   \" 는 isBlank() = true");
                }
            }
            default -> {
                System.out.println("값을 다시 입력하세요!");
            }
        }
        System.out.println("모든 method의 반환 값 boolean");


    }
}
