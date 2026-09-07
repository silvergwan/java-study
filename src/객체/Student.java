package 객체;

public class Student {
    private String name;
    private int score;

    Student(String name, int score) {
        validateScore(score);

        this.name = name;
        this.score = score;
    }

    void printInfo() {
        System.out.println("학생 이름 = " + name + ", 점수 = " + score);
    }

    private void validateScore(int score){
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException(
                    "점수는 0점부터 100점까지만 가능합니다."
            );
        }
    }

    public void changeScore(int newScore) {
        validateScore(newScore);
        score = newScore;
    }
}
