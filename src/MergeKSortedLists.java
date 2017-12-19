import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x;}
}
public class MergeKSortedLists {
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists==null|| lists.length == 0)
            return null;
        List<Integer> integerList = new LinkedList<>();
        for (int i = 0; i < lists.length; i++) {
            while (lists[i] != null){
                integerList.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        if (integerList.size() != 0){
            Collections.sort(integerList);
            ListNode result = new ListNode(integerList.get(0));
            ListNode point = result;
            for (int i = 1; i < integerList.size(); i++) {
                ListNode listNode = new ListNode(integerList.get(i));
                point.next = listNode;
                point = listNode;

            }
            return result;
        }
        else
            return null;
    }

    public static void main(String[] args) {

    }
}
