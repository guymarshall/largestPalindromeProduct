public class Main {
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    public static boolean isPalindrome(int number) {
        String numberAsString = String.valueOf(number);
        String reversedNumberCharacters = reverseString(numberAsString);
        return numberAsString.equals(reversedNumberCharacters);
    }
    public static void main(String[] args) {
        /*
        A palindromic number reads the same both ways.
        The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
        Find the largest palindrome made from the product of two 3-digit numbers.
        */
        System.out.println(isPalindrome(999));
        System.out.println(isPalindrome(988));
    }
}