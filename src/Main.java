import java.util.Scanner;

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
        System.out.print("Enter a number of digits: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int maxNumber = (int)Math.pow(10, userInput) - 1;
        int largestPalindrome = 0;
        int product = 1;

        for (int i = 0; i <= maxNumber; i++) {
            for (int j = 0; j <= maxNumber; j++) {
                product = i * j;
                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                }
            }
        }

        System.out.printf("Maximum palindrome product for %d digits is %d.", userInput, largestPalindrome);
    }
}