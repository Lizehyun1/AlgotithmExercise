import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[m] = nums[i];
                m++;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 3};
        removeElement(nums, 3);
    }
}
