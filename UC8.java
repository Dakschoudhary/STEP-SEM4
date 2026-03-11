import java.util.*;

class UC8 {
    char data;
    Node next;

    Node(char val) {
        data = val;
        next = null;
    }
}

class LinkedListPalindrome {

    Node head;

    void insert(char c) {
        Node newNode = new Node(c);

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

    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    boolean isPalindrome() {
        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListPalindrome list = new LinkedListPalindrome();

        System.out.print("Enter a string: ");
        String s = sc.next();

        for (char c : s.toCharArray()) {
            list.insert(c);
        }

        if (list.isPalindrome())
            System.out.println("The string is a Palindrome");
        else
            System.out.println("The string is NOT a Palindrome");
    }
}