package 객체;

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student("최은관", -75);
        Student student2 = new Student("안유진", 95);

        student1.printInfo();
        student2.printInfo();
    }

}
