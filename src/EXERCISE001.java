import java.util.Scanner;

/* Instructions:
 * 1. Input two numbers
 * 2. Report their sum, difference and product
 */

public class EXERCISE001 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numbers[] = new int [2];
    // INPUT
    for (int i = 0; i < 2; i++) {
      System.out.print("Number " + (i+1) + ": ");
      numbers[i] = sc.nextInt();
    }
    // OUTPUT
    System.out.println("Sum: " + (numbers[0] + numbers[1]));
    System.out.println("Difference: " + (numbers[0] - numbers[1]));
    System.out.println("Product: " + (numbers[0] * numbers[1]));
    sc.close();
  }
}