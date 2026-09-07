package 중간점검.상속;

public class Student extends Person{
    private int score;

    public Student(String name, int score){
        super(name);
        this.score = score;
    }

    public void printScore(){
        System.out.println("점수는 " + score + "점입니다.");
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.println("제 점수는 " + score + "점입니다.");
    }

}
