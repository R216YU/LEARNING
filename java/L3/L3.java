package L3;

public class L3 {
    public static void main(String[] args) {
        // Animal coco = new Animal();
        // coco.name = "Coco";
        // coco.color = "white and black";

        Animal coco = new Animal("ココ", "白と黒");

        System.out.println(coco.name + " : " + coco.color + " : " + coco.WAN);

        System.out.println(coco.getInfo("%sは%s色の犬"));

        System.out.println(coco.getSum(1, 2, 3, 4, 5));
    }
}
