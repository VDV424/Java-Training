import java.util.Scanner;

public class SeatBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter seat number: ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 150 && num % 3 == 0) {
            System.out.println("occupied");
        } else {
            System.out.println("book");
        }

        sc.close();
    }
}
