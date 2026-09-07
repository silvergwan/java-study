package 객체;

public class StudentMain {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "최은관";
        student1.score = 75;

        Student student2 = new Student();
        student2.name = "안유진";
        student2.score = 95;

        student1.printInfo();
        student2.printInfo();
    }
}
