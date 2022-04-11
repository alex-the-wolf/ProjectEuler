public class Main {
    /*
    "Find the largest palindrome made from the product of two 3-digit numbers."

    I will write a helper function to check if a number is a palindrome. It will have worst case of O(N/2) where N is
    the number of digits. Then I will write a for loop that starts at 999 and goes to 100 that multiplies
     */

    // method to check if a number is a palindrome
    public static boolean isPalindrome(int n) {
        boolean result = true;

        // convert n to a string to be able to check specific digits
        String stringN = String.valueOf(n);
        // highest index
        int length = stringN.length()-1;

        for (int i = 0; i <= length/2; i++) {
            if (stringN.charAt(i) != stringN.charAt(length-i)) {
                return false;
            }
        }
        return result;
    }

    // method to find the biggest palindromic product of two 3-digit integers
    public static int biggestPalindrome() {
        int ans = 0;

        for (int i = 999; i > 99; i--) {
            for (int j = i; j > 99; j--) {
                int prod = i*j;
                if (isPalindrome(prod)) {
                    ans = Math.max(ans, prod);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(biggestPalindrome());
    }
}
