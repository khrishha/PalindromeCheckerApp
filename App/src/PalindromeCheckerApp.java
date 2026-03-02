import java.util.Scanner;

public class PalindromeCheckerApp {

    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("      Palindrome Checker App");
        System.out.println("=====================================");
        System.out.println("UC8: Linked List Based Palindrome Checker");
        System.out.println("-------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        for (char c : cleaned.toCharArray()) {
            append(c);
        }

        if (isPalindrome(head)) {
            System.out.println("✅ \"" + input + "\" is a palindrome!");
        } else {
            System.out.println("❌ \"" + input + "\" is NOT a palindrome.");
        }

        System.out.println("-------------------------------------");
        System.out.println("Program execution completed.");
        sc.close();
    }

    static void append(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    static boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}