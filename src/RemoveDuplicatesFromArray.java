import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int n : nums){
            if (i < 1 || nums[i - 1] != n)
                nums[i++] = n;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 5};
        System.out.println(removeDuplicates(nums));
    }
}
