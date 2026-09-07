package 중간점검.상속;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("제 이름은 " + name + "입니다!");
    }
}
