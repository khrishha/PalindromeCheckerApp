import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("      Palindrome Checker App");
        System.out.println("=====================================");
        System.out.println("UC7: Deque-Based Optimized Palindrome Checker");
        System.out.println("-------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : cleaned.toCharArray()) {
            deque.add(ch);
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("✅ \"" + input + "\" is a palindrome!");
        } else {
            System.out.println("❌ \"" + input + "\" is NOT a palindrome.");
        }

        System.out.println("-------------------------------------");
        System.out.println("Program execution completed.");
        sc.close();
    }
}