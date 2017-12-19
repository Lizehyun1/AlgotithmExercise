import java.util.*;

public class SubSet {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        dfs(res, temp, nums, 0);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, int i){
        res.add(new ArrayList<Integer>(temp));
        for (int j = i; j < nums.length; j++) {
            temp.add(nums[j]);
            dfs(res, temp, nums, j + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
