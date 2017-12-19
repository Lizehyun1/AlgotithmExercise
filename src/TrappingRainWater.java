public class TrappingRainWater {
    public static int trap(int[] height) {
        int max = 0;
        int water = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] >= max)
                max = height[i];
        }
        for (int i = 0; i < max; i++) {
            int star = 0;
            int end = 0;
            for (int j = 0; j < height.length; j++) {
                if (height[j] > i) {
                    star = j;                               //get first one
                    break;
                }
            }
            for (int j = 0; j < height.length; j++) {
                if (height[j] > i)
                    end = j;
            }
            if (star < end) {
                int count = 0;
                for (int j = star; j <= end; j++) {
                    if (height[j] < i+1)
                        count++;
                }
                water += count;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
