import java.util.Scanner;

class PalindromeChecker {

    public boolean checkPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}

public class UC11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (checker.checkPalindrome(input))
            System.out.println("The string is a Palindrome");
        else
            System.out.println("The string is NOT a Palindrome");
    }
}