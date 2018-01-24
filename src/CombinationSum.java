import java.util.*;
public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        help(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    public static void help(List<List<Integer>> result, List<Integer> temp, int[] candidates, int target, int start){
        int sum = 0;
        for (int j = 0; j< temp.size(); j++) {
            sum += temp.get(j);
        }
        if (sum > target)
            return;
        if (sum == target)
            result.add(new ArrayList<>(temp));
        else {
            for (int i = start; i < candidates.length; i++) {
                temp.add(candidates[i]);
                help(result, temp, candidates, target, i);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        System.out.println(combinationSum(candidates, 7));
    }
}
