package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public static void printAlphabet() {
        for(int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        printAlphabet();
    }
}
