public class L4 {
    public static void main(String[] args) {
        // superClass + subClass 継承extends
        Hamster ham = new Hamster("coco", "white");
        System.out.println(ham.name);
        ham.gnaw();

        // interface + implements
        Triangle tri = new Triangle(10, 3);
        System.out.println(tri.base + " : " + tri.height);
        System.out.println(tri.getArea());

        // 無名クラス、無名インターフェイス
        Peuple p = new Peuple() {
            @Override
            public String saySomething() {
                return "こんにちわ";
            }
        };
        System.out.println(p.saySomething());

        // 無名クラスの定義を、ラムダ式で書き直す(関数型interfaceのみ 関数型interface: メソッドが一つしかないinterfaceのこと)
        Peuple hito = () -> {
            return "im hito";
        };
        System.out.println(hito.saySomething());
    }

}
