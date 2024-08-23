import java.util.Scanner;
public class Taskexample6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input size of the pattern (i, j, k)
            System.out.print("Enter the size of the pattern: ");
            int n = scanner.nextInt();

            // Outer loop for rows
            for (int i = 1; i <= n; i++) {
                // Inner loop for columns
                for (int j = 1; j <= i; j++) {
                    System.out.print(n - j + 1); // Printing decreasing numbers
                }
                // Filling the rest of the columns with the same number
                for (int k = i; k < n; k++) {
                    
                    System.out.print(n - i + 1);
                }
                // Move to the next line after each row
                System.out.println();
            }
        }
    }

