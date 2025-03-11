/*LeetCode link:- https://leetcode.com/problems/remove-duplicates-from-sorted-list/ */

public class removeDuplicate {
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

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
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

    public static ListNode deleteDuplicates(ListNode head) {
        // Handle empty list
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        
        // Traverse list until we reach the end
        while (current.next != null) {
            // If current node's value equals next node's value
            if (current.val == current.next.val) {
                // Skip duplicate by linking current node to node after next
                current.next = current.next.next;
            } else {
                // Move to next node if no duplicate found
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 3, 5};
        ListNode head = createList(values);
        printList(head);
        head = deleteDuplicates(head);
        printList(head);
    }
}
