package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void printDigitsSum(int t){
        String numberToStr = t + "";
        int result = 0;
        for(int i = 0; i < numberToStr.length(); i++) {
            result += t%10;
            t /= 10;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        printDigitsSum(12348);
    }
}
