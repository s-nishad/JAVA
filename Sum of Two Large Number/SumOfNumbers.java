import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        String x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = sc.nextLine();
        System.out.print("Enter the second number: ");
        y = sc.nextLine();

        Calculation obj = new Calculation();
        String Result = obj.Addition(x, y);

        System.out.println("The Addition is: " + Result);
    }
}
