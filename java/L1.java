import java.util.Arrays;

public class L1 {
    public static void main(String[] args) {
        // 変数宣言
        double num = 3.14, num1 = 2.16;
        System.out.println(num + " : " + num1);

        // 型推論 var
        var title = "TITLE";
        System.out.println(title);

        // 定数宣言 final
        final String GREETING_MSG = "Hello world!";
        System.out.println(GREETING_MSG);

        // データ型
        // 基本型 boolean | byte, short, int, long | float, double | char, String | 配列 ex:
        // int[] String[]
        boolean flag = true;
        System.out.println(flag);

        byte b = -128;
        short s = 32767;
        int i = 12345678;
        long l = 1000000;
        System.out.println(b + " : " + s + " : " + i + " : " + l);

        float f = 1.1234f;
        double d = 1.12345;
        System.out.println(f + " : " + d);

        char c = 'あ';
        String str = "あいうえおかきくけこさしすせそ";
        System.out.println(c + " : " + str);

        int[] list = { 1, 2, 3, 4, 5 };
        System.out.println(list[2]);
        System.out.println(list.length);

        String[][] list2 = {
                { "あ", "い" },
                { "う", "え" },
                { "お" }
        };
        System.out.println(list2[0][1]);

        // データ型の変換 型キャスト
        long lo = 50;
        int in = (int) lo;
        System.out.println(in);

        // 演算子 + - * / % ++ --

        // データ型の基本形vs参照型
        int x = 1;
        int y = x;
        y++;
        System.out.println(x + " : " + y);

        int[] data = { 1, 2, 3 };
        int[] data2 = data;
        data2[0] = 1000;
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(data2));

        // 比較演算子 == は同一性を確認するための演算子 参照型のデータは同じ値を持っているだけ、異なる場所に格納されている場合がある
        // このとき同一性=falseとなる
        // example
        String[] s1 = { "あ", "い" };
        String[] s2 = { "あ", "い" };
        boolean identity = s1 == s2;
        System.out.println(identity);

        System.out.println(Arrays.equals(s1, s2)); // 格納されている値が同じかどうかを判定する

        String[] s3 = { "あ", "い" };
        String[] s4 = s3;
        boolean identity2 = s3 == s4;
        System.out.println(identity2);
    }
}
