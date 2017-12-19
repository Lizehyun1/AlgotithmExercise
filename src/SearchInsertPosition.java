public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0){
            return 0;
        }
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result = i;
                break;
            }
        }

        if (result == -1){
            if (target <= nums[0])
                result = 0;
            else if (target >= nums[nums.length - 1])
                result = nums.length;
            else {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] < target && nums[i + 1] > target){
                        result = i + 1;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 2));
    }
}
