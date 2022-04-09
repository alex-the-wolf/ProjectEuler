public class Main {
    /*
    "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
    The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000."

    The approach here is divide and conquer. We will first find and sum all multiples of 3 < 1000 and then find and sum all
    multiples of 5 < 1000 that are not divisible by 3. Adding those two numbers together gives our answer.
     */

    private static int multiplesOfThree() {
        // keep track of sum to return
        int sum = 0;
        // sum every multiple of 3 less than 1000
        for (int i=3; i<1000; i=i+3) {
            sum += i;
        }
        return sum;
    }

    // NOTE: this method ignores multiples of 5 that are also multiples of 3
    private static int multiplesOfFive() {
        // keep track of sum to return
        int sum = 0;
        // sum every multiple of 5...
        for (int i=5; i<1000; i=i+5) {
            // IF it isn't a multiple of 3
            if (i%3 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int total = 0;
        total += multiplesOfThree();
        total += multiplesOfFive();
        System.out.println(total);
    }
}
