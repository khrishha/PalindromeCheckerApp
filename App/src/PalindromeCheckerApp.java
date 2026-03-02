import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome
    public static boolean isPalindrome(String input) {

        // Step 1: Normalize string
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Step 2: Convert to char array
        char[] arr = normalized.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        // Step 3: Compare characters
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker App");
        System.out.println("UC10: Case-Insensitive & Space-Ignored Palindrome");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }

        scanner.close();
    }
}