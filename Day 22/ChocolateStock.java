import java.util.Scanner;

public class ChocolateStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of chocolates: ");
        int totalChocolates = sc.nextInt();

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        System.out.print("Enter chocolates consumed per day: ");
        int consumedPerDay = sc.nextInt();

        int totalRequired = days * consumedPerDay;

        if (totalChocolates >= totalRequired) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
