package 중간점검;

public class SafeStudentMain {
    public static void main(String[] args){
        SafeStudent student1 = new SafeStudent("최은관", 59);
        SafeStudent student2 = new SafeStudent("안유진", 95);

        student1.printInfo();
        student2.printInfo();
    }
}
