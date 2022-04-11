public class Main {
    /*
    What is the largest prime factor of the number 600851475143?

    divide by 2 while possible, then divide by 'i' where 'i' starts at 3 and increments by 2 until the root of the number
     */

    // A function to print all prime factors
    // of a given number n
    public static void biggestPrimeFactor(long n)
    {
        // Print the number of 2s that divide n
        while (n%2 == 0)
        {
            System.out.print(2 + " ");
            n /= 2;
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2)
            System.out.print(n);
    }

    public static void main(String[] args) {
        Long n = 600851475143L;
        biggestPrimeFactor(n);
    }


}
