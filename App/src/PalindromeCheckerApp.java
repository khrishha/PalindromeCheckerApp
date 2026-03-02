import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("====================================="); System.out.println(" Palindrome Checker App");
        System.out.println("====================================="); System.out.println("UC3: Palindrome Check Using String Reverse"); System.out.println("-------------------------------------"); Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: "); String original = sc.nextLine();
        String cleaned = original.replaceAll("\\s+", ""); String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) { reversed += cleaned.charAt(i);
        }
        if (cleaned.equalsIgnoreCase(reversed)) {
            System.out.println("✅\"" + original + "\" is a palindrome!"); } else {
            System.out.println("❌\"" + original + "\" is NOT a palindrome.");
        }
        System.out.println("-------------------------------------"); System.out.println("Program execution completed.");
        sc.close();
    }
}

