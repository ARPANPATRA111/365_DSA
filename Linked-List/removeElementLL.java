/*LeetCode link:- https://leetcode.com/problems/remove-linked-list-elements/ */

public class removeElementLL {
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

    public static ListNode removeElements(ListNode head, int val) {
        // Handle edge case where list is empty
        if (head == null) {
            return null;
        }
        
        // Skip over nodes with matching value at the beginning
        while (head != null && head.val == val) {
            head = head.next;
        }
        
        // If all nodes had matching value
        if (head == null) {
            return null;
        }
        
        // Traverse remaining list and remove matching values
        ListNode current = head;
        while (current.next != null) {
            if (current.next.val == val) {
                // Skip over the node with matching value
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        
        return head;
    }
    public static void main(String[] args) {
        int[] values = {1, 2, 6, 3, 4, 5, 6};
        int val = 6;
        ListNode head = createList(values);
        printList(head);
        head = removeElements(head, val);
        printList(head);
    }
}
