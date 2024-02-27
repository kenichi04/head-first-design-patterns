package section1;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飛べません");
    }
}
