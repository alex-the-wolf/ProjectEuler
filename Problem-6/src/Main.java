public class Main {
    /*
    "Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum."

    I will write two methods that find the sum of squares and square of sums respectively then subtract them in the main
     */

    // method to find the sum of the squares up to a natural number n
    public static int sumOfSquares(int n) {
        int sum = 0;

        for (int i=1; i < 101; i++) {
            sum += Math.pow(i,2);
        }
        return sum;
    }

    // method to find the square of the sums of all natural numbers up to n
    public static int squareOfSums(int n) {
        int square;

        int sum = 0;
        for (int i=1; i < 101; i++) {
            sum += i;
        }

        square = (int) Math.pow(sum, 2);

        return square;
    }

    public static void main(String[] args) {
        int square = squareOfSums(100);
        int sum = sumOfSquares(100);
        System.out.println(square-sum);
    }

}
