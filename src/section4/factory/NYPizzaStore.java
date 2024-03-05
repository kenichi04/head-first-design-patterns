package section4.factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("チーズ")) return new NYStyleCheesePizza();
        return null;
    }
}
