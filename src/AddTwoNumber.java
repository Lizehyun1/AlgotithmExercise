 /* class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class AddTwoNumber {


    public static String TransToString(ListNode l1){
        StringBuilder s1 = new StringBuilder();
        while (l1 != null){
            Integer integer = new Integer(l1.val);
            s1.append(integer.toString());
            l1 = l1.next;
        }
        String s = s1.reverse().toString();
        return s;
    }

    public static int TransToInt(String s){
        int integer;
        integer = Integer.parseInt(s);
        return integer;
    }

    public static String add(int a, int b){
        Integer sum = new Integer(a + b);
        return sum.toString();
    }

    public static ListNode TransToList(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        String s1 = stringBuilder.reverse().toString();
        Character[] ch = new Character[s1.length()];
        ListNode l1 = new ListNode();
        ListNode l2 = l1;
        int i = 0;
        while (i < ch.length){
            l1.val = Integer.parseInt(ch[i].toString());
            l1.next = new ListNode();
            l1 = l1.next;
        }
        return l2;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = TransToString(l1);
        String s2 = TransToString(l2);
        String sum = add(TransToInt(s1), TransToInt(s2));
        ListNode l3 = TransToList(sum);
        return l3;
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
*/