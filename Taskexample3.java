// program is used to reversed the given number
import java.util.Scanner;

public class Taskexample3 {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner obj = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a numbers: ");
        int n = obj.nextInt();

        // Initialize a variable to hold the reversed number
        int r = 0;
        int originalNumber = n; // Preserve the original number for display

        // Use a for loop to reverse the number
        for (; n != 0; ) {
            int r1= n % 10;  // Get the last digit of the number
            r = r * 10 + r1;  // Append the digit to the reversed number
            n /= 10;  // Remove the last digit from the number

        }

        // Print the reversed number
        System.out.println("Reversed numbers is:"+ r);

    }
}