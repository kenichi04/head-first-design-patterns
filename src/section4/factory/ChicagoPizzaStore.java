package section4.factory;

import section4.factory.ingredients.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        // TODO: NYPizzaStoreを参考に修正
//        if (type.equals("チーズ")) return new ChicagoStyleCheesePiza();
        // TODO: ピザクラス追加
        return null;
    }
}
