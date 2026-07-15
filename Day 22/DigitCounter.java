import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int di = (num + "").length();
        System.out.println("Number of digits: " + di);
        if (di == 5) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
