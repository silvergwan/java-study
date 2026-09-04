public class Variable {
    public static void main(String[] args) {
        String name = "최은관";
        int age = 19;

        System.out.println(name);
        System.out.println(age);
        // 변수는 값을 저장하고 이름을 붙여 사용하는 공간, 이름표가 붙은 상자
        // 변수의 역할 : 같은 값을 여러 곳에서 사용할 때 이름을 붙여 관리하는 것

        // 저장할 값에 따라 변수의 종류인 타입도 달라짐
        int weight = 70;              // 정수
        double height = 175.5;        // 실수
        boolean isStudent = true;     // 참 또는 거짓
        char grade = 'A';             // 문자 하나: 작은따옴표
        String bias = "안유진";        // 문자열: 큰따옴표

        // 기존 변수의 값을 바꿀 때는 자료형 안 붙힘 => 초기화가 아닌 대입이기 때문
        age = 20;
        System.out.println(age); // 20

        // =는 수학의 등호와 다름, 오른쪽을 먼저 계산해서 왼쪽에 저장하라는 뜻
        age = age + 1;
        System.out.println(age); // 21

        age++; // age = age + 1;과 같은 효과
        System.out.println(age); // 22

        age--; // age = age - 1;과 같은 효과
        System.out.println(age); // 21

        age += 5; // age = age + 5;
        System.out.println(age); // 26

        age -= 3; // age = age - 3;
        System.out.println(age); // 23
    }
}