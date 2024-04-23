package section7.adapter.duck;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkeyの出力: ");
        turkey.gobble();
        turkey.fly();
        System.out.println("\n");

        System.out.println("Duckの出力: ");
        testDuck(duck);
        System.out.println("\n");

        System.out.println("TurkeyAdapterの出力: ");
        testDuck(turkeyAdapter);
        System.out.println("\n");
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
