// program to calculate the purchased amount and discount amount
import java.util.Scanner;

public class Taskexample5 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Input purchase amount
        System.out.print("Enter the purchase amount: ");
        double a = obj.nextInt();

        double b = a;

        // Apply discount based on purchase amount
        if (a >= 500 && a <= 1000) {
            b = a * 0.90;  // 10% discount
        } else if (a > 1000) {
            b = a * 0.80;  // 20% discount
        }

        // Output the final payable amount
        System.out.println("Discount amount is : Rs" + b);

    }
}






