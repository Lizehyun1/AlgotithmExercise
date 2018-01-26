import java.util.*;
public class PermutationSequence {
    public static String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        StringBuilder sb2 = new StringBuilder();
        int div = 1;
        for (int i = 1; i < n; i++) {
            div *= i;
        }
        int length = n - 1;
        while (sb2.length() < n && length > 0){
            sb2.append(list.get((k - 1) / div));
            list.remove((k - 1) / div);
            k = k - (k - 1) / div * div; //the important point of this solution!!!
            div = div / length;
            length--;
        }
        sb2.append(list.get(0));
        return sb2.toString();
    }

    public static void main(String[] args) {
        System.out.println(getPermutation(4, 5));
    }
}
