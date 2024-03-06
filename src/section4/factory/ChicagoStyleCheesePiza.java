package section4.factory;

import section4.factory.ingredients.PizzaIngredientFactory;

public class ChicagoStyleCheesePiza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ChicagoStyleCheesePiza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println(name + "を下準備");
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }

    @Override
    void cut() {
        System.out.println("ピザを四角形にカットする");
    }
}
