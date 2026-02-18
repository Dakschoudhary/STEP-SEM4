
import java.util.*;
        public class Pallindrome {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int rev = 0;
                int rem;
                System.out.println("ENTER THE NUMBER:");
                int num = sc.nextInt();
                int originalNum = num;

                while (num > 0) {
                    rem = num % 10;
                    rev = (rev * 10) + rem;
                    num = num / 10;
                }


                if (originalNum == rev) {
                    System.out.println(originalNum + " is a palindrome number.");
                } else {
                    System.out.println(originalNum + " is not a palindrome number.");
                }
                sc.close();
            }
        }

