
//  program to using for loop to print a number 10 to 50
import java.util.Scanner;
public class Taskexample1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        {// Get user input for first to last
            System.out.print("Enter the first number:");
            {// reads a integer form user
                int first = obj.nextInt();
                System.out.print("Enter the last number:");
                // reads another integer
                int last = obj.nextInt();
                // Print numbers using for loop
                for (int i = first; i <= last; i++) {
                    System.out.println(i);
                }
            }
        }
    }
}


