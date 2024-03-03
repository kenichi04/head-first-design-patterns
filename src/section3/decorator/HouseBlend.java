package section3.decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "ハウスブレンドコーヒー";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
