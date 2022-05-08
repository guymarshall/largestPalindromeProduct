import java.util.Scanner;

public class Main {
    static StringBuilder stringBuilderReverse = new StringBuilder();
    static StringBuilder stringBuilder = new StringBuilder();
    public static boolean isPalindrome(int number) {
        String numberAsString = String.valueOf(number);

        stringBuilder.setLength(0);
        stringBuilderReverse.setLength(0);
        stringBuilder.append(numberAsString);
        stringBuilderReverse.append(numberAsString);
        stringBuilderReverse.reverse();

        return stringBuilderReverse.compareTo(stringBuilder) == 0;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number of digits: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int maxNumber = (int)Math.pow(10, userInput) - 1;
        int largestPalindrome = 0;
        int product;

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
}