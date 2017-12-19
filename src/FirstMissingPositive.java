import java.util.Arrays;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums){
        Arrays.sort(nums);
        if (nums == null || nums.length == 0)
            return 1;
        int m = 0;
        int result;
        if (nums[nums.length - 1] <= 0)
            return 1;
        else {
            while (m < nums.length) {
                if (nums[m] <= 0)
                    m++;
                else
                    break;
            }
        }
        if (nums[m] != 1)
            result = 1;
        else{
            int i;
            for ( i = m+1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1] + 1 && nums[i] != nums[i - 1])
                    break;
            }
            if (i == nums.length)
                result = nums[i -1] + 1;
            else
                result = nums[i - 1] + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,2,2};
        System.out.println(firstMissingPositive(nums));
    }

}
