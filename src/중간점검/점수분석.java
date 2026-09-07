package 중간점검;

public class 점수분석 {
    public static void main(String[] args) {
        int[] scores = {70, 95, 83, 88, 100, 76};

        // 전체 합계
        System.out.println(calculateSum(scores));
        // 가장 높은 점수
        System.out.println(maxScore(scores));
        // 60점 이상인 학생 수
        System.out.println(overScore(scores));

    }

    public static int calculateSum(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;

    }

    public static int maxScore(int[] scores){
        int max = 0;
        for (int i = 0; i < scores.length; i++){
            if(scores[i] >= max){
                max = scores[i];
            }
        }
        return max;
    }

    public static int overScore(int[] scores){
        int count = 0;
        for (int i = 0; i < scores.length; i++){
            if(scores[i] >= 60){
                count++;
            }
        }
        return count;
    }
}
