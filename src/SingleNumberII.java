import java.util.Arrays;
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        if (nums.length == 1)
            return nums[i];
        while (i < nums.length){
            if (i != nums.length - 1){
                if (nums[i] == nums[i + 1])
                    i += 3;
                else
                    break;
            }
            else
                return nums[i];
        }
        return nums[i];

    }
}
