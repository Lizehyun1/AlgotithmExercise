import java.util.Arrays;

public class Sum3Close {
    public static int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE/2; //如果result = MAX_VALUE，在target = -1时，result - target会上溢出，这时result - target结果为MIN_VALUE
        int sum;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(result - target)){ //这是判定为Math.abs(sum - target) > Math.abs(result - target)
                    result = sum; //此条语句不执行
                }
                if (sum > target)
                    right--;
                else
                    left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, -1, -1, 3};
        System.out.println(threeSumClosest(nums, -1));
    }
}
