import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("====================================="); System.out.println(" Palindrome Checker App");
        System.out.println("====================================="); System.out.println("UC3: User Input & Dynamic Palindrome Check"); System.out.println("-------------------------------------"); Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: "); String input = sc.nextLine();
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase(); String reversed = "";
        for (int i = cleanedInput.length() - 1; i >= 0; i--) { reversed += cleanedInput.charAt(i);
        }
        if (cleanedInput.equals(reversed)) {
            System.out.println("✅\"" + input + "\" is a palindrome!"); } else {
            System.out.println("❌\"" + input + "\" is NOT a palindrome.");
        }
        System.out.println("-------------------------------------"); System.out.println("Program execution completed.");
        sc.close();
    }
}
