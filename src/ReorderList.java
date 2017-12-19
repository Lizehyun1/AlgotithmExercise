import java.util.List;
public class ReorderList {
    public static void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;
        ListNode startPoint = head;
        ListNode endPoint = removeEnd(head);
        while (startPoint.next != null){
            endPoint.next = startPoint.next;
            startPoint.next = endPoint;
            startPoint = startPoint.next.next;
            endPoint = removeEnd(startPoint);
        }
        startPoint.next = endPoint;
    }

    public static ListNode removeEnd(ListNode head){
        while ( head.next != null && head.next.next != null)
            head = head.next;
        ListNode endNode = head.next;
        head.next = null;
        return endNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(7);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        reorderList(head);
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
