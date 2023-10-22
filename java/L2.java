public class L2 {
    public static void main(String[] args) {
        // プログラムの構造: 順次、選択、反復
        // if
        int num = 20;
        if (num == 10) {
            System.out.println("NUM is 10.");
        } else if (num == 20) {
            System.out.println("NUM is 20");
        } else {
            System.out.println("NUM isn't 10 or 20.");
        }

        // switch 旧構文
        int num1 = 3;
        switch (num1) {
            case 1:
                System.out.println("val = 1");
                break;
            case 2:
                System.out.println("val = 2");
                break;
            case 3:
                System.out.println("val = 3");
                break;
            default:
                System.out.println("none");
                break;
        }

        // switch 新構文
        String lang = "YUAA";
        String category = switch (lang) {
            case "PHP", "Python", "Ruby" -> "スクリプト言語";
            case "Java", "C", "C#" -> "プログラミング言語";
            default -> "不明";
        };
        System.out.println(category);

        // while
        int val = 0;
        while (val < 5) {
            System.out.println(val);
            val++;
        }

        // do while
        int n = 3;
        do {
            System.out.println(n);
            n++;
        } while (n < 5);

        // for
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // for each
        String[] data = { "hello", "world", "!" };
        for (String v : data) {
            System.out.println(v);
        }
    }
}
