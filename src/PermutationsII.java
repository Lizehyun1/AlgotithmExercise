import java.util.*;
public class PermutationsII {
    public static List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        help(nums, new ArrayList<>(), result, used);
        return result;
    }

    public static void help(int[] nums, List<Integer> temp, List<List<Integer>> result, boolean[] used) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i])
                    continue;
                if (i >0 && nums[i - 1] == nums[i] && used[i - 1] == false)
                    continue;
                used[i] = true;
                temp.add(nums[i]);
                help(nums, temp, result, used);
                used[i] = false;
                temp.remove(temp.size() - 1);
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 1 , 2};
        System.out.println(permute(nums));
    }
}
