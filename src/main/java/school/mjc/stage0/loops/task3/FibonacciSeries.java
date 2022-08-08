package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void printFibonacci(int lastFibonacci) {
        int first = 0;
        int second = 1;
        int third = 1;
        for(int i = 0; i < lastFibonacci; i++) {
            System.out.println(first);
            second = third;
            third = first + second;
            first = second;
        }
    }

    public static void main(String[] args) {
        //printFibonacci(3);
    }
}
