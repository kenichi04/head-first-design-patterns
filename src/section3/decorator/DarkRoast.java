package section3.decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "ダークローストコーヒー";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
