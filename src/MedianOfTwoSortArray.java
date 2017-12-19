import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianOfTwoSortArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        double median;
        int l = nums1.length + nums2.length;
        int[] nums3 = new int[l];
        for (int i = 0; i < nums1.length; i++) {
            nums3[i] = nums1[i];
        }
        int j = nums1.length;
        for (int i = 0; i < nums2.length; i++) {
            nums3[j] = nums2[i];
            j++;
        }
        Arrays.sort(nums3);
        if((nums3.length % 2 ) == 0){

            median = (nums3[nums3.length/2 - 1] + nums3[nums3.length/2]) / 2.0;
        }
        else {
            median = nums3[nums3.length / 2];
        }

        return median;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
