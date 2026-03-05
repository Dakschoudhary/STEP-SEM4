import java.util.*;

public class UC7 {
    public static void main(String[] args) {
        String str = "madam";

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : str.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}