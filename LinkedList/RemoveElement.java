class RemoveElements {
    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null; 
        }
    }
    public static ListNode removeElements(ListNode head, int val) {
     ListNode dummy = new ListNode(0);
     dummy.next = head;
     ListNode current = dummy;
     while(current.next != null) {
        if(current.next.val ==val) {
            current.next = current.next.next;
        }
        else {
            current = current.next;
        }
        }
        return dummy.next;

     }
    }
