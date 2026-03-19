package exception.ex.tryCatch.no1;

public class Student {
    String name;
    int scores;
    int kor;
    int eng;
    int math;
    double average;
    String grade;

    public Student(){
        this("Isa", 300, 100, 100, 100, 100.0, "A");
    }
    public Student(String name, int scores, int kor, int eng, int math, double average, String grade){
        this.name = name;
        this.scores = scores;
        this.kor= kor;
        this.eng = eng;
        this.math = math;
        this.average = average;
        this.grade = grade;
    }

    public void calAverage(){
        average = scores/3.0;
    }
    public void setScores(int kor, int eng, int math){
        this.kor=kor;
        this.eng = eng;
        this.math = math;
        this.scores = kor+eng+math;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", scores=" + scores +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", average=" + average +
                ", grade='" + grade + '\'' +
                '}';
    }


}
