package L3;

// クラス宣言
public class Animal {
    // フィールド定義
    String name = "DOG";
    String color = "BLACK";

    // static final修飾子
    static final String WAN = "Wan!";

    // メソッド定義
    public String getInfo(String format) {
        return String.format(format, this.name, this.color);
    }

    public double getSum(double... nums) {
        double res = 0;
        for (double num : nums) {
            res += num;
        }
        return res;
    }

    // コンストラクター宣言
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
