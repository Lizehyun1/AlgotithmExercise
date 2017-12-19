public class JumpGame {
    public static boolean canJump(int[] nums){
        if (nums.length == 0)
            return false;
        int i = 0;
        while (i < nums.length){
            int distance = nums[i];
            i = i + distance;
            if (nums[i] == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
