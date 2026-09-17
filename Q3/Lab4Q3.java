import java.util.Scanner;

public class Lab4Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String result = (number > 0)
                ? "Number is Positive"
                : (number < 0)
                    ? "Number is Negative"
                    : "Number is Zero";

        System.out.println(result);
    }
}