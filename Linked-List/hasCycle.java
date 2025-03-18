/*LeetCode link:- https://leetcode.com/problems/linked-list-cycle/ */

public class hasCycle {
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

    public static boolean hasCycleee(ListNode head) {
        // Handle edge cases
        if (head == null || head.next == null) {
            return false;
        }

        // Initialize two pointers
        ListNode slow = head;
        ListNode fast = head;

        // Traverse the linked list
        while (fast != null && fast.next != null) {
            // Move slow pointer one step at a time
            slow = slow.next;

            // Move fast pointer two steps at a time
            fast = fast.next.next;

            // If pointers meet, there's a cycle
            if (slow == fast) {
                return true;
            }
        }

        // If we reach the end, there's no cycle
        return false;
    }

    public static void main(String[] args) {
        // Test Case 1: List with a cycle
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = head1.next; // Create cycle: 4 -> 2

        System.out.println("Test Case 1 (List with cycle):");
        System.out.println("Has cycle: " + hasCycleee(head1));

        // Test Case 2: List without a cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);

        System.out.println("\nTest Case 2 (List without cycle):");
        System.out.println("Has cycle: " + hasCycleee(head2));

        // Test Case 3: Single node
        ListNode head3 = new ListNode(1);

        System.out.println("\nTest Case 3 (Single node):");
        System.out.println("Has cycle: " + hasCycleee(head3));

        // Test Case 4: Empty list
        ListNode head4 = null;

        System.out.println("\nTest Case 4 (Empty list):");
        System.out.println("Has cycle: " + hasCycleee(head4));
    }
}
