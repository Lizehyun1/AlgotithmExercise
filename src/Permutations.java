import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(lists, new ArrayList<>(), nums);
        return lists;
    }


    private void backtrack(List<List<Integer>> lists, List<Integer> tempList, int[] nums){
        if (tempList.size() == nums.length)
            lists.add(new ArrayList<>(tempList));
        else{
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i]))
                    continue;
                tempList.add(nums[i]);
                backtrack(lists, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {

    }
}
