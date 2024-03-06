package section4.factory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyStore.orderPizza("チーズ");
        System.out.println("イーサンの注文は" + nyPizza.getName() + "\n");

        // TODO: ChicagoPizzaStore修正後
//        Pizza chicagoPizza = chicagoStore.orderPizza("チーズ");
//        System.out.println("ジョエルの注文は" + chicagoPizza.getName() + "\n");
    }
}
