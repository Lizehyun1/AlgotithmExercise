import java.util.*;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> com = new ArrayList<List<Integer>>();
        combin1(com, new ArrayList<>(), 1, n, k);
        return com;
    }

    public static void combin1(List<List<Integer>> com, List<Integer> comb, int start, int n, int k){
        if (k == 0){
            com.add(new ArrayList<>(comb));
            return;
        }

        for (int i = start; i <= n ; i++) {
            comb.add(i);
            combin1(com, comb, i + 1, n, k - 1);
            comb.remove(comb.size() - 1);
        }
    }
}
