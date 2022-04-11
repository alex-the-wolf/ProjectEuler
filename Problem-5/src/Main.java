public class Main {
    /*
    "What is the smallest positive number that is evenly divisible by all the numbers from 1 to 20?"

    First we can note that we don't need to check if it's divisible by every number. We must check the primes 3,5,7,11,13,17,19,
    and we must check 20, 16, 18 but every other number is a multiple of those numbers.
     */

    // method to check if a number is divisible by x s.t. x->[1,20]
    public static boolean evenlyDivisible(int n) {
        int[] divisors = {3,5,7,11,13,16,17,18,19,20};

        for (int divisor: divisors) {
            if (n%divisor != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i=20; i<3*5*7*11*13*16*17*19*20; i++) {
            if (evenlyDivisible(i)) {
                System.out.println(i);
                System.exit(0);
            }
        }
    }

}
