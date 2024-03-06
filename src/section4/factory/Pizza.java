package section4.factory;

import section4.factory.ingredients.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();

    void bake() {
        System.out.println("180度で25分焼く");
    }

    void cut() {
        System.out.println("ピザを扇形にカットする");
    }

    void box() {
        System.out.println("PizzaStoreの箱にピザを入れる");
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
