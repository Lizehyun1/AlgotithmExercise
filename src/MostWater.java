public class MostWater {
    public static int maxArea(int[] height){
        int maxValue = 0;
        int l = 0, r = height.length - 1;
        while (l < r){
            maxValue = Math.max(maxValue, (Math.min(height[l], height[r]) * (r - l)));
            if (height[l] > height[r])
                r--;
            else
                l++;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] height = {5,5,7,2,7,9};
        System.out.println(maxArea(height));
    }
}
