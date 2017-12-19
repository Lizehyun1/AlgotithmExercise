public class ReverseNodesInkGroup {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null){
            return null;
        }
        ListNode point = head;
        int count = 0;
        while (count != k && point != null){
            point = point.next;
            count++;
        }
        if (count == k){
            point = reverseKGroup(point, k);
            while (count-- > 0){
                ListNode temp = head.next;
                head.next = point;
                point = head;
                head = temp;
            }
            head = point;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode result = reverseKGroup(head, 2);
    }
}
