public class RemoveDuplicatesFromSortedListII {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode pre = fakeHead;
        ListNode cur = head;
        while (cur != null){
            while (cur.next != null && cur.val == cur.next.val)
                cur = cur.next;
            if (pre.next == cur)
                pre = pre.next;
            else
                pre.next = cur.next;
            cur = cur.next;
        }
        return fakeHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode next = new ListNode(2);
        head.next = next;
        ListNode resutl = deleteDuplicates(head);
        System.out.println(resutl.val);
    }
}
