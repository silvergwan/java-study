package 중간점검;

public class SafeStudent {
    private String name;
    private int score;

    SafeStudent(String name, int score) {
        validateName(name);
        validateScore(score);

        this.name = name;
        this.score = score;
    }

    public void printInfo(){
        System.out.println("학생 이름 = " + name + ", 점수 = " + score);
        System.out.println(isPass());
    }

    // 이름 검증
    public void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("이름은 비어있거나 null일 수 없습니다.");
        }
    }

    // 점수 검증
    public void validateScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("점수는 0부터 100까지만 가능합니다.");
        }
    }

    public boolean isPass() {
        return score >= 60;
    }
}
