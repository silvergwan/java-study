package 클래스;

//어떠한 클래스로부터 만들어진 객체를 그 클래스의 인스턴스라고 한다.
//아래의 코드에서 Phone은 클래스이고, 메인 함수의 galaxy와 iphone은 인스턴스들이다.


class Phone {
    String model;
    String color;
    int price;
}

public class Main {
    public static void main(String[] args){
        Phone galaxy = new Phone();
        galaxy.model = "Galaxy10";
        galaxy.color = "Black";
        galaxy.price = 100;

        Phone iphone = new Phone();
        iphone.model = "iPhoneX";
        iphone.color = "Gray";
        iphone.price = 200;

        System.out.println("은관이는 이번에 " + galaxy.model + " " + galaxy.color + " 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("유진이는 이번에 " + iphone.model + " " + iphone.color + " 색상을 " + iphone.price + "만원에 샀다.");
    }
}

//따라서 클래스는 붕어빵을 만들어내는 틀이라고 할 수 있으며, 인스턴스는 붕어빵 틀에 의해 만들어진 붕어빵이라고 할 수 있다.
