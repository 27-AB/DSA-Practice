public class ReverseLinkedList {
    
    // simple singly linked list node
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    /**
     * Reverse the linked list in-place and return new head.
     */
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // helper to print list
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // create sample list 1->2->3->4->5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original list: ");
        printList(head);

        head = reverse(head);

        System.out.print("Reversed list: ");
        printList(head);
    }
}
