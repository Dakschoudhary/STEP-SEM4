import java.util.*;

interface PalindromeStrategy {
    boolean isPalindrome(String str);
}

class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        for (char c : str.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray())
            deque.addLast(c);

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast())
                return false;
        }

        return true;
    }
}

class PalindromeChecker {
    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String str) {
        return strategy.isPalindrome(str);
    }
}

public class UC12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeChecker checker;

        checker = new PalindromeChecker(new StackStrategy());

        if (checker.check(input))
            System.out.println("Palindrome using Stack Strategy");
        else
            System.out.println("Not a Palindrome");
    }
}