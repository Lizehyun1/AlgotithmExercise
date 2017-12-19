public class SwapNodesinPairs {
    public static ListNode swapPairs(ListNode head){
        if ((head == null) || (head.next == null))
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next != null){
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            second.next = first;
            current = current.next.next;
        }
        return  dummy.next;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode result = swapPairs(head);
        System.out.println(result.next.val);
    }
}




//  first(current) -> second -> second.next;
