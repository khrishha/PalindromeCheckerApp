import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("====================================="); System.out.println(" Palindrome Checker App");
        System.out.println("=====================================");



        System.out.println("UC4: Character Array Based Palindrome Check");
        System.out.println("-------------------------------------"); Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: "); String input = sc.nextLine();
        String cleaned = input.replaceAll("\\s+", "").toLowerCase(); char[] chars = cleaned.toCharArray();
        int start = 0;
        int end = chars.length - 1; boolean isPalindrome = true;




        while (start < end) {
            if (chars[start] != chars[end]) { isPalindrome = false;
                break;
            }
            start++; end--;
        }
        if (isPalindrome) {
            System.out.println("✅ \"" + input + "\" is a palindrome!"); } else {
            System.out.println("❌ \"" + input + "\" is NOT a palindrome.");
        }



        System.out.println("-------------------------------------");



        System.out.println("Program execution completed.");
        sc.close();

    }
}
