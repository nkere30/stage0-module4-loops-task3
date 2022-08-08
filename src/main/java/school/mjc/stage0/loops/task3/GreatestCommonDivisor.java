package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public static void printGCD(int first, int second) {
        int lowerNumber = 0;
        if(first > second) {
            lowerNumber = second;
        } else {
            lowerNumber = first;
        }
        int gcd = 0;
        for(int i = 1; i <= lowerNumber; i++) {
            if(first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    public static void main(String[] args) {
        printGCD(1, 2);
    }
}
