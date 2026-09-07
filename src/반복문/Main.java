package 반복문;

public class Main {
    public static void main(String[] args) {
        // 안녕하세요 5번
        for (int i = 1; i <= 5; i++) {
            System.out.println("안녕하세요");
        }

        // 줄바꿈으로 1, 2, 3, 4, 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // 1부터 10까지 짝수만 출력 ->
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        // 1부터 10까지 홀수만 더한 합계
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
