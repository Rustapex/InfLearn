package exception.ex.tryCatch.no1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentService {
    private Scanner sc = new Scanner(System.in);
    private Student student;

    StudentService(Student student){
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        setStudentInfo(student);
    }

    private void setStudentInfo(Student student){
        System.out.println("학생 정보를 입력하세요");
        System.out.print("이름 : ");
        String inputName = sc.nextLine();
        System.out.print("국어성적 : ");
        int inputKor = tryCatchInt(student);
        System.out.print("영어성적 : ");
        int inputEng = tryCatchInt(student);
        System.out.print("수학성적 : ");
        int inputMath = tryCatchInt(student);
        student.setScores(inputKor, inputEng, inputMath);
        student.calAverage();
        System.out.println("학생 정보 입력이 완료되었습니다.");
    }

    private int tryCatchInt(Student student){
        try{
            return Integer.parseInt(sc.nextLine());
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
        } /*catch (student.kor ) {
            이부분에 0~100 입력 을 제외한 입력 예외처리 잘 모르겠어.
        } */
        catch (Exception e) {
            System.out.println("\n\ne.printStackTrace()");
            System.out.println("나중에 보고 catch 추가");
        } finally {
            System.out.println("입력이 종료되었습니다.");
            return 0;
        }
    }
}
