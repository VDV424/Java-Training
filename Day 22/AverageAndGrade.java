import java.util.Scanner;

public class AverageAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] marks = new double[5];
        double sum = 0;
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
            sum += marks[i];
        }
        double average = sum / 5.0;
        System.out.println("Total Marks: " + sum);
        System.out.printf("Average Marks: %.2f%n", average);
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else if (average >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Calculated Grade: " + grade);
    }
}
