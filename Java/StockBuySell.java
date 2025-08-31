import java.util.Scanner;

public class StockBuySell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for number of days
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        // Ask user for prices
        System.out.println("Enter stock prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Logic to calculate max profit
        for (int i = 0; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        // Final output
        System.out.println("Maximum Profit: " + maxProfit);

        sc.close();
    }
}
