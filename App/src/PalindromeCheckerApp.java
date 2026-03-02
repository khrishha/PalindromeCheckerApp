import java.util.Scanner; import java.util.Queue; import java.util.LinkedList; import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("====================================="); System.out.println(" Palindrome Checker App");
        System.out.println("====================================="); System.out.println("UC6: Queue + Stack Based Palindrome Check");



        System.out.println("-------------------------------------"); Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: "); String input = sc.nextLine();
        String cleaned = input.replaceAll("\\s+", "").toLowerCase(); Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < cleaned.length(); i++) { char ch = cleaned.charAt(i);
            queue.add(ch); // enqueue stack.push(ch); // push
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) { isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("✅ \"" + input + "\" is a palindrome!"); } else {
            System.out.println("❌ \"" + input + "\" is NOT a palindrome.");
        }
        System.out.println("-------------------------------------"); System.out.println("Program execution completed.");
        sc.close();
    }
}
