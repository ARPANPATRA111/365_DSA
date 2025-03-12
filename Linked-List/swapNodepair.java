/*LeetCode link:- https://leetcode.com/problems/swap-nodes-in-pairs/description/ */

public class swapNodepair {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static ListNode swapPairs(ListNode head) {
        // Handle edge cases
        if (head == null || head.next == null) {
            return head;
        }
        
        // Create dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        while (prev.next != null && prev.next.next != null) {
            // Nodes to be swapped
            ListNode first = prev.next;
            ListNode second = prev.next.next;
            
            // Swap the nodes
            prev.next = second;
            first.next = second.next;
            second.next = first;
            
            // Reinitialize pointers for next iteration
            prev = first;
        }
        
        return dummy.next;
    }

    // Method to create a linked list from an array of values
    public static ListNode createList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode curr = head;
        for (int i = 1; i < values.length; i++) {
            curr.next = new ListNode(values[i]);
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = createList(values);
        printList(head);
        head = swapPairs(head);
        printList(head);
    }
}