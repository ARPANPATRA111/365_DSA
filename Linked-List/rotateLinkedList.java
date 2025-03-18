/*LeetCode link:- https://leetcode.com/problems/rotate-list/ */

public class rotateLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Method to create a linked list from an array of values
    public static ListNode createList(int[] values) {
        if (values.length == 0)
            return null;
        ListNode head = new ListNode(values[0]);
        ListNode curr = head;
        for (int i = 1; i < values.length; i++) {
            curr.next = new ListNode(values[i]);
            curr = curr.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static ListNode rotateRight(ListNode head, int n) {
        if (head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;

        int i;
        for (i = 0; fast.next != null; i++)// Get the total length
            fast = fast.next;

        for (int j = i - n % i; j > 0; j--) // Get the i-n%i th node
            slow = slow.next;

        fast.next = dummy.next; // Do the rotation
        dummy.next = slow.next;
        slow.next = null;

        return dummy.next;
    }

    public static void main(String[] args) {
        // Test Case 1: List with length 5, rotate 2 places
        int[] values1 = {1,2,3,4,5};
        ListNode head1 = createList(values1);

        System.out.println("Test Case 1 (Rotate 5-length list by 2):");
        System.out.println("Before: 1 -> 2 -> 3 -> 4 -> 5");
        head1 = rotateRight(head1, 2);
        System.out.println("After:  4 -> 5 -> 1 -> 2 -> 3");
        printList(head1);

        // Test Case 2: List with length 3, rotate 4 places
        int[] values2 = {1,2,3};
        ListNode head2 = createList(values2);

        System.out.println("\nTest Case 2 (Rotate 3-length list by 4):");
        System.out.println("Before: 1 -> 2 -> 3");
        head2 = rotateRight(head2, 4);
        System.out.println("After:  3 -> 1 -> 2");
        printList(head2);

        // Test Case 3: Single node
        int[] values3 = {1};
        ListNode head3 = createList(values3);

        System.out.println("\nTest Case 3 (Single node):");
        System.out.println("Before: 1");
        head3 = rotateRight(head3, 5);
        System.out.println("After:  1");
        printList(head3);

        // Test Case 4: Empty list
        ListNode head4 = null;

        System.out.println("\nTest Case 4 (Empty list):");
        System.out.println("Before: null");
        head4 = rotateRight(head4, 3);
        System.out.println("After:  null");
        printList(head4);
    }
}
