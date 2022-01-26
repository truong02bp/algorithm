package leetcode.easy;

public class TimeToBuyStock {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int i=0;i<prices.length;i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else {
                if (prices[i] - minPrice > profit)
                    profit = prices[i] - minPrice;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{7,1,5,3,6,4};
        int[] arrays2 = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(arrays));
        System.out.println(maxProfit(arrays2));
    }
}
