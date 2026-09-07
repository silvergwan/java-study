package 객체;

public class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    void printInfo() {
        System.out.println("학생 이름 = " + name + ", 점수 = " + score);
    }

    boolean isPass() {
        if (score >= 60) {
            return true;
        } else {
            return false;
        }
    }
}
