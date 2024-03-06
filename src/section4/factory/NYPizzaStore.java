package section4.factory;

import section4.factory.ingredients.NYPizzaIngredientFactory;
import section4.factory.ingredients.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (type.equals("チーズ")) {
            pizza = new NYStyleCheesePizza(ingredientFactory);
            pizza.setName("ニューヨークスタイルチーズピザ");
        }
        // TODO: ピザクラス追加
//        else if (type.equals("野菜")) return new NYStyleVegiePizza();
//        else if (type.equals("アサリ")) return new NYStyleClamPizza();
//        else if (type.equals("ペパロニ")) return new NYStylePepperoniPizza();

        return pizza;
    }
}
