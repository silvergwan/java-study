package 메서드;

// 메서드는 함수와 유사한 개념, 자바에선 클래스 안에 정의하는 함수를 메서드라 함
public class Main {
    public static void main(String[] args){
        int[] scoresA = {80, 95, 70};
        int[] scoresB = {10, 20, 30};

        System.out.println(calculateSum(scoresA)); // 245
        System.out.println(calculateSum(scoresB)); // 60
    }
    // 이 메서도 입력 -> 처리 -> 결과 반환 구조를 이룸
    // 입력: 점수 배열 받음
    // 처리: 점수를 모두 더함
    // 반환: 합계를 돌려줌
    public static int calculateSum(int[] scores){
        int sum = 0;

        for (int score : scores){
            sum += score;
        }

        return sum;
    }
}
