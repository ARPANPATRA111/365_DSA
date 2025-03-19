public class deleteMidLL {
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

    public static ListNode deleteMiddle(ListNode head) {
        // Handle edge cases
        if (head == null) return null;
        if (head.next == null) return null;
        
        // Initialize pointers
        ListNode prev = null;      // Tracks node before slow pointer
        ListNode slow = head;      // Moves one node at a time
        ListNode fast = head;      // Moves two nodes at a time
        
        // Move pointers until fast reaches end
        while (fast != null && fast.next != null) {
            prev = slow;           // Update previous pointer
            slow = slow.next;      // Move slow pointer one step
            fast = fast.next.next; // Move fast pointer two steps
        }
        
        // Delete middle node by linking prev to node after slow
        prev.next = slow.next;
        
        return head;
    }

    public static void main(String[] args) {
                // Test Case 1: List with odd number of nodes (5 nodes)
                int[] values1 = {1,2,3,4,5};
                ListNode head1 = createList(values1);
                
                System.out.println("Test Case 1 (Delete middle from 5 nodes):");
                System.out.println("Before: 1 -> 2 -> 3 -> 4 -> 5");
                head1 = deleteMiddle(head1);
                System.out.println("Expected Result:  1 -> 2 -> 4 -> 5 -> null");
                System.out.print("Result: ");
                printList(head1);
                
                // Test Case 2: List with even number of nodes (4 nodes)
                int[] values2 = {1,2,3,4};
                ListNode head2 = createList(values2);
                
                System.out.println("\nTest Case 2 (Delete middle from 4 nodes):");
                System.out.println("Before: 1 -> 2 -> 3 -> 4");
                head2 = deleteMiddle(head2);
                System.out.println("Expected Result:  1 -> 2 -> 4 -> null");
                System.out.print("Result: ");
                printList(head2);
                
                // Test Case 3: Single node
                int[] values3 = {1};
                ListNode head3 = createList(values3);

                System.out.println("\nTest Case 4 (Single node):");
                System.out.println("Before: 1");
                head3 = deleteMiddle(head3);
                System.out.println("Expected Result:  null");
                System.out.print("Result: ");
                printList(head3);
                
                // Test Case 4: Empty list
                ListNode head4 = null;
                
                System.out.println("\nTest Case 5 (Empty list):");
                System.out.println("Before: null");
                head4 = deleteMiddle(head4);
                System.out.println("Expected Result:  null");
                System.out.print("Result: ");
                printList(head4);
    }
}
