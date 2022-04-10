public class Main {
    /*
    "By considering the terms in the Fibonacci sequence whose values do not exceed four million,
    find the sum of the even-valued terms."

    Write a function to find the Fibonacci numbers and note that each even term is separated by 2 odd terms
     */
    private static int fibTo4MillSum() {
        int sum = 0;

        // set first and second terms of fib sequence
        int t1 = 1;
        int t2 = 2;

        // to track which number in the even, odd, odd, even, odd, odd, even... sequence we are at
        int index = 3;

        // iterate until the next term would exceed 4 million
        while (t2 <= 4000000) {
            if (index == 3) {
                sum += t2;
                index = 0;
            }
            int tmp = t2;
            t2 = t1+t2;
            t1 = tmp;
            index++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fibTo4MillSum());
    }
}
