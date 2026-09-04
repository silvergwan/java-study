package 메서드;

// 안내 방송처럼 말만 해주는 메서드도 있고, 계산기처럼 결과를 돌려주는 메서드도 있음
public class ThiefMesodeu {
    public static void main(String[] args){
        sayHello("최은관");
        sayHello("안유진");
    }
    public static void sayHello(String name){
        System.out.println(name + "님,안녕하세요!");
    }
}
