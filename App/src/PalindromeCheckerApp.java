import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Common normalization method
    private static String normalize(String input) {
        return input.toLowerCase().replaceAll("\\s+", "");
    }

    // 1️⃣ Two-Pointer Method
    public static boolean twoPointerCheck(String input) {
        String str = normalize(input);
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // 2️⃣ Stack Method
    public static boolean stackCheck(String input) {
        String str = normalize(input);
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // 3️⃣ Deque Method
    public static boolean dequeCheck(String input) {
        String str = normalize(input);
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker App");
        System.out.println("UC13: Performance Comparison");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Two Pointer
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();

        // Stack
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();

        // Deque
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Two Pointer: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque: " + result3 +
                " | Time: " + (end3 - start3) + " ns");

        scanner.close();
    }
}