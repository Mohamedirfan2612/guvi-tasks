//  program to find the smallest numbers among the three numbers
import java.util.Scanner;
public class Taskexample4 {

        public static void main(String[] args) {
            Scanner obj= new Scanner(System.in);

            // Input three numbers
            System.out.print("Enter the first number: ");
            int n1 = obj.nextInt();

            System.out.print("Enter the second number: ");
            int n2 = obj.nextInt();

            System.out.print("Enter the third number: ");
            int n3 = obj.nextInt();

            // Find the smallest number using a basic approach
            int s = n1;

            if (n2 < s) {
                s = n2;
            }

            if (n3 < s) {
                s = n3;
            }

            // Output the smallest number
            System.out.println("The smallest number is: " + s);

        }
    }
