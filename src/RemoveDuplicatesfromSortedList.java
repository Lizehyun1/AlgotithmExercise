public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode point = head;
        while (point != null && point.next != null) {
            if (point.next.val == point.val) {
                point.next = point.next.next;
            }
            else {
                point = point.next;
            }
        }
        return head;
    }
}
