package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        int total = 0;
        for(int i = 0; i < lengthOfLastNumber; i++) {
            result = result * 10 + 9;
            total += result;
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        calculateSum(6);
    }
}
