package 객체;

public class Student {
    private String name;
    private int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    void printInfo() {
        System.out.println("학생 이름 = " + name + ", 점수 = " + score);
    }

    void changeScore(int newScore) {
        if (newScore < 0 || newScore > 100) {
            System.out.println("점수는 0점부터 100점까지만 가능합니다.");
            return;
        }

        score = newScore;
    }

    boolean isPass() {
        if (score >= 60) {
            return true;
        } else {
            return false;
        }
    }
}
