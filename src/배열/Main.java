package 배열;

public class Main {
    public static void main(String[] args){
        int[] scores = {80, 95, 70};
        // 배열의 위치 번호인 인덱스는 0부터 시작, 따라서 값이 3개라면 인덱스는 0, 1, 2

        int sumScore = 0;
        for (int i = 0; i < scores.length; i++) {
            sumScore += scores[i];
        }
        System.out.println(sumScore);

        int sumScore1 = 0;
        // 향상된 for문 : scores에서 값을 하나씩 꺼내 score에 담고 반복한다
        for (int score : scores){
            sumScore1 += score;
        }
        System.out.println(sumScore1); //245
    }
}
