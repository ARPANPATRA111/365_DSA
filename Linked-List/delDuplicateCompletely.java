/*LeetCode link:- https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/ */

public class delDuplicateCompletely {
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

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null && cur.next != null){
            if(cur.val != cur.next.val){
                pre = cur;
                cur = cur.next;
            }else{
                while(cur.next != null && cur.next.val == cur.val){
                    cur = cur.next;
                }
                if(pre != null){
                    pre.next = cur.next;
                }else{
                    head = cur.next;
                }
                cur = cur.next;
            }
        }
        return head;    
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 3, 4, 4, 5};
        ListNode head = createList(values);
        printList(head);
        head = deleteDuplicates(head);
        printList(head);
    }
}
