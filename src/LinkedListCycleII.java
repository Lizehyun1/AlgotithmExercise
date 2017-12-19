import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        ListNode point = head;
        while (point != null){
            if (!set.contains(point)) {
                set.add(point);
                point = point.next;
            }
            else
                return point;
        }
        return null;
    }
}
