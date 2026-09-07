package 중간점검.상속;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public void printSubject() {
        System.out.println("담당 과목은 " + subject + "입니다.");
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("제 담당 과목은 " + subject + "입니다.");
    }


}
