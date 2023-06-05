package Question1;

/*

Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListMiddleNode {
    public ListNode findMiddleNode(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        // Example usage
        LinkedListMiddleNode solution = new LinkedListMiddleNode();

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode middleNode = solution.findMiddleNode(head);
        if (middleNode != null) {
            System.out.println("Middle node value: " + middleNode.val);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
