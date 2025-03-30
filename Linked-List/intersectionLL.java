/*LeetCode link:- https://leetcode.com/problems/intersection-of-two-linked-lists/ */

public class intersectionLL {
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

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        
        ListNode pA = headA, pB = headB;

        while (pA != pB) {
            if (pA != null) {
                pA = pA.next;
            } else {
                pA = headB;
            }

            if (pB != null) {
                pB = pB.next;
            } else {
                pB = headA;
            }
        }
        return pA;
    }

    public static void main(String[] args) {
        int[] valuesA = {4, 1, 8, 4, 5}, valuesB = {5, 6, 1, 8, 4, 5};
        ListNode headA = createList(valuesA), headB = createList(valuesB);
        printList(headA);
        printList(headB);
        ListNode headC = getIntersectionNode(headA, headB);
        if(headC == null){
            System.out.println("No intersection");
        }
        else{
            printList(headC);
        }
    }
}
