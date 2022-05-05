import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static StringBuilder stringBuilderReverse = new StringBuilder();
    static StringBuilder stringBuilder = new StringBuilder();

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    public static boolean isPalindrome(int number) {
        String numberAsString = String.valueOf(number);

        stringBuilder.setLength(0);
        stringBuilderReverse.setLength(0);
        stringBuilder.append(numberAsString);
        stringBuilderReverse.append(numberAsString);
        stringBuilderReverse.reverse();

        return stringBuilderReverse.compareTo(stringBuilder) == 0;

//        String reversedNumberCharacters = reverseString(numberAsString);
//        return numberAsString.equals(reversedNumberCharacters);
    }
    public static void main(String[] args) {
        System.out.print("Enter a number of digits: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int maxNumber = (int)Math.pow(10, userInput) - 1;
        int largestPalindrome = 0;
        int product = 1;

        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 1; j <= maxNumber; j++) {
                product = i * j;
                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                }
            }
        }

        System.out.printf("Maximum palindrome product for %d digits is %d.", userInput, largestPalindrome);
    }

//    public static void main(String[] args) {
//        System.out.print("Enter a number of digits: ");
//        Scanner scanner = new Scanner(System.in);
//        int userInput = scanner.nextInt();
//        int maxNumber = (int)Math.pow(10, userInput) - 1;
//
//        ArrayList<Integer> products = new ArrayList<Integer>();
//
//        for (int i = 0; i <= maxNumber; i++) {
//            for (int j = 0; j <= maxNumber; j++) {
//                products.add(i * j);
//            }
//        }
//
//        ArrayList<Integer> palindromes = new ArrayList<Integer>();
//
//        for (int product : products) {
//            if (isPalindrome(product)) {
//                palindromes.add(product);
//            }
//        }
//
//        int largestPalindrome = 0;
//
//        for (int palindrome : palindromes) {
//            if (palindrome > largestPalindrome) {
//                largestPalindrome = palindrome;
//            }
//        }
//
//        System.out.printf("Maximum palindrome product for %d digits is %d.", userInput, largestPalindrome);
//    }
}