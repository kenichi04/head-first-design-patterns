package section4.factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("チーズ")) return new NYStyleCheesePizza();
        // TODO: ピザクラス追加
//        else if (type.equals("野菜")) return new NYStyleVegiePizza();
//        else if (type.equals("アサリ")) return new NYStyleClamPizza();
//        else if (type.equals("ペパロニ")) return new NYStylePepperoniPizza();
        return null;
    }
}
