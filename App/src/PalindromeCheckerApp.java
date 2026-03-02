import java.util.Scanner;

// Service class following Encapsulation
class PalindromeChecker {

    // Public method to check palindrome
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Normalize string (ignore case and spaces)
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        char[] arr = normalized.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker App");
        System.out.println("UC11: Object-Oriented Palindrome Service");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        // Create service object
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }

        scanner.close();
    }
}