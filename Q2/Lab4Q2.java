import java.util.Scanner;

public class Lab4Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Exam Marks: ");
        double examMarks = input.nextDouble();

        System.out.print("Enter Lab Submission Marks: ");
        double labMarks = input.nextDouble();

        // Validate marks
        if (examMarks < 0 || examMarks > 100 ||
            labMarks < 0 || labMarks > 100) {

            System.out.println("Invalid marks. Marks should be between 0 and 100.");

        } else {

            System.out.print("Enter Exam Percentage: ");
            double examPercentage = input.nextDouble();

            System.out.print("Enter Lab Percentage: ");
            double labPercentage = input.nextDouble();

            // Validate percentages
            if (examPercentage + labPercentage != 100) {

                System.out.println("Invalid percentages. Percentages should add up to 100.");

            } else {

                double finalMark =
                        (examMarks * examPercentage / 100) +
                        (labMarks * labPercentage / 100);

                System.out.println("Final Mark = " + finalMark);
            }
        }
    }
}