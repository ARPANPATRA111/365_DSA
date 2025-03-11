/*LeetCode link:- https://leetcode.com/problems/remove-nodes-from-linked-list/ */

public class removeNodes {
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
    
    public static ListNode removeNodesFromVal(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newNode = removeNodesFromVal(head.next);
        if(head.val < newNode.val) {
            return newNode;  // Return the new head when current node is removed
        }
        head.next = newNode;
        return head;
    }
    
    public static void main(String[] args) {
        int[] values = {5,2,13,3,8};
        ListNode head = createList(values);
        printList(head);
        head = removeNodesFromVal(head);
        printList(head);
    }
}