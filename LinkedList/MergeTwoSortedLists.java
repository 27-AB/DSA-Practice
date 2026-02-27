// MergeTwoSortedLists.java
// LeetCode #21 - Merge Two Sorted Lists
// Time Complexity: O(n + m)
// Space Complexity: O(1)

class MergeTwoSortedLists{
    // Definition for singly-linked list
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }

    }
    public static ListNode mergeTwoLists(ListNode L1, ListNode L2){
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(L1 != null && L2 != null){
            if(L1.val <= L2.val){
                current.next = L1;
                L1 = L1.next;
            }
            else{
                current.next = L2;
                L2 = L2.next;
            }
            current =  current.next;
        }
        if(L1 != null){
            current.next = L1;
        }
         else{
            current.next = L2;
         }
         return dummy.next;
    }
// Helper function to print list
public static void printList(ListNode head){
    while(head != null){
        System.out.print(head.val + " -> ");
        head = head.next;
    }
    System.out.println("null");
}
// Main method to test
public static void main(String[] args){
    ListNode L1 = new ListNode(1);
    L1.next = new ListNode(2);
    L1.next.next = new ListNode(4);
    
    ListNode L2 = new ListNode(1);
    L2.next = new ListNode(3);
    L2.next.next = new ListNode(4);

    ListNode mergedHead = mergeTwoLists(L1, L2);
    printList(mergedHead);
}
        
        
    
}

