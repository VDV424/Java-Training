import java.util.Scanner;

public class StockProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter buying price per stock: ");
        float buyingPrice = sc.nextFloat();
        System.out.print("Enter number of stocks: ");
        float noOfStocks = sc.nextFloat();
        System.out.print("Enter current stock price: ");
        float currentPrice = sc.nextFloat();
        float totalCost = buyingPrice * noOfStocks;
        float totalValue = currentPrice * noOfStocks;
        if (totalValue > totalCost) {
            float profit = totalValue - totalCost;
            System.out.println("Profit: " + profit);
        } else if (totalCost > totalValue) {
            float loss = totalCost - totalValue;
            System.out.println("Loss: " + loss);
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}
