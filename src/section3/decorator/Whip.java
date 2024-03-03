package section3.decorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "、ホイップ";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
