public class Practice {
    public static void main(String[] args) {
        String w = "prac";
        PracticeInterface prac = (word) -> word + word;
        System.out.println(prac.name + "    " + prac.printPractice(w));
    }

}
