public class TwoSum {
    public static int[] twoSum(int[] sums, int target){
        int[] result = new int[2];
        for (int i = 0; i < sums.length; i++) {
            for (int j = i + 1; j < sums.length; j++) {
                if (sums[i] + sums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] sums = {2,5,5,11};
        int target = 10;
        int[] result = TwoSum.twoSum(sums,target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}