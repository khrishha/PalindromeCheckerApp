import java.util.Scanner; import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("====================================="); System.out.println(" Palindrome Checker App");
        System.out.println("====================================="); System.out.println("UC5: Stack-Based Palindrome Checker"); System.out.println("-------------------------------------"); Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: "); String input = sc.nextLine();
        String cleaned = input.replaceAll("\\s+", "").toLowerCase(); Stack<Character> stack = new Stack<>();
        for (int i = 0; i < cleaned.length(); i++) { stack.push(cleaned.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) { reversed += stack.pop();
        }
        if (cleaned.equals(reversed)) {
            System.out.println("✅ \"" + input + "\" is a palindrome!"); } else {
            System.out.println("❌ \"" + input + "\" is NOT a palindrome.");
        }
        System.out.println("-------------------------------------"); System.out.println("Program execution completed.");
        sc.close();
    }
}
