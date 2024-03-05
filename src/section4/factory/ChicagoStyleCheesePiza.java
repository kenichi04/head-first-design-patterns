package section4.factory;

public class ChicagoStyleCheesePiza extends Pizza {
    public ChicagoStyleCheesePiza() {
        name = "シカゴスタイルのディープディッシュチーズピザ";
        dough = "極厚クラスト生地";
        sauce = "プラムトマトソース";
        toppings.add("シュレッドモッツアレラチーズ");
    }

    @Override
    void cut() {
        System.out.println("ピザを四角形にカットする");
    }
}
