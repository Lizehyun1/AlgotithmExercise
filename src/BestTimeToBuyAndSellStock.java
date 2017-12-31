public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        if (prices.length <= 1)
            return 0;
        int[] value = new int[prices.length - 1];
        for (int i = 0; i < value.length; i++) {
            value[i] = prices[i + 1] - prices[i];
        }
        int max = 0;
        int temp = 0;
        for (int i = 0; i < value.length; i++) {
            temp = temp + value[i];
            if (temp > 0){
                max = Math.max(max, temp);
            }
            else
                temp = 0;

        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
