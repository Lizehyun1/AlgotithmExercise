public class SearchRange {
    public static int[] searchRange(int[] nums, int target){
        int[] result = new int[2];
        int point = 0;
        while (point != nums.length){
            if (nums[point] != target)
                point++;
            else
                break;
        }

        if (point == nums.length) {
            for (int i = 0; i < result.length; i++) {
                result[i] = -1;
            }
        }
        else{
            result[0] = point;
            for (int i = point; i < nums.length; i++) {
                if (nums[i] == target)
                    result[1] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] result = searchRange(nums, 9);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
