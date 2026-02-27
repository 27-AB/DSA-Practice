class RemoveNthNodeFromEnd {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n ) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move first n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        // Move both pinters until fast reaches the end 
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
        
    }
    // Helper function to print List
    public static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
    }
    // Main method to test
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 2;
        System.out.print("Orginal List: ");
        printList(head);
        System.out.println();
        head = removeNthFromEnd(head, n);
        System.out.print("After removal: ");

        printList(head);
    }
}