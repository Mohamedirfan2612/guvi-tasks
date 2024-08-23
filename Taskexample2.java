//program to find given number is negative or positive
import java .util.Scanner;
public class Taskexample2 {
    public static void main(String[] args) {

                // Create a Scanner object to read input
                 Scanner obj = new Scanner(System.in);

                // Get user input
                System.out.print("Enter a number: ");
                int number = obj.nextInt();

                // Check if the number is positive or negative
                if (number > 0) {
                    System.out.println("The number is positive.");
                } else if (number < 0) {
                    System.out.println("The number is negative.");
                }
                }
            }
