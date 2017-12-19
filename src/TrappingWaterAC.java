public class TrappingWaterAC {
    public static int trap(int[] height){
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        while (left <= right){
            maxLeft = Math.max(maxLeft, height[left]);
            maxRight = Math.max(maxRight, height[right]);
            if (maxLeft < maxRight){
                max += maxLeft - height[left];
                left++;
            }
            else {
                max += maxRight - height[right];
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}

