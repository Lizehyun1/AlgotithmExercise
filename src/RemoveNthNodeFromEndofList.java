public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode right = head;
        ListNode left = head;
        for (int i = 1; i < n + 1; i++)
            right = head.next;
        while (right != null){
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return head;
    }

    public static void main(String[] args) {

    }
}
