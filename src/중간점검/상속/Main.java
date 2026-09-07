package 중간점검.상속;

public class Main {
    public static void main(String[] args){
        Student student = new Student("최은관", 78);
        Teacher teacher = new Teacher("안유진", "체육");

        Person[] people = {student, teacher};

        for (Person person : people){
            person.introduce();
        }
    }
}
