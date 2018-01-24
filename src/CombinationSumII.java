import java.util.*;
public class CombinationSumII {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        help(candidates, result, new ArrayList<Integer>(), 0, target);
        return result;
    }

    private static void help(int[] candidates, List<List<Integer>> result, List<Integer> temp, int point, int remain){
        if (remain == 0) {
            result.add(new ArrayList<>(temp));
        }
        else if (remain < 0)
            return;
        else {
            for (int i = point; i < candidates.length; i++) {
                if (i > point && candidates[i - 1] == candidates[i])
                    continue;
                temp.add(candidates[i]);
                help(candidates, result, temp, i + 1, remain - candidates[i]);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        System.out.println(combinationSum2(candidates, 8));
    }
}
