package 중간점검;

public class 배열 {
    public static void main(String[] args) {
        int[] scores1 = {80, 95, 70};
        int[] scores2 = {10, 20, 30};

        int sumScore1 = 0;
        int sumScore2 = 0;

        for (int i = 0; i < scores1.length; i++) {
            sumScore1 += scores1[i];
        }

        for (int score : scores2){
            sumScore2 += score;
        }

        System.out.println(sumScore1);
        System.out.println(sumScore2);
    }
}