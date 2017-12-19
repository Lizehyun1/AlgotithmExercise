public class RemoveDuplicatesII {
    public static int removeDuplicates(int[] nums) {
        int i  = 0;
        for (int n : nums){
            if (i < 2 || nums[i - 2] != n ) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
}



