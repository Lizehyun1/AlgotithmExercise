public class SortColor {
    public static void sortColor(int[] nums){
        int[] count = new int[3];
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];  // nums中各个元素的位置，排在第几个
        }
        for (int i = nums.length - 1; i>=0; i--){
            result[count[nums[i]] - 1] = nums[i];
            count[nums[i]]--;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,0,2,1};
        sortColor(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
