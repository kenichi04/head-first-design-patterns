package section4.factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("チーズ")) return new ChicagoStyleCheesePiza();
        return null;
    }
}
