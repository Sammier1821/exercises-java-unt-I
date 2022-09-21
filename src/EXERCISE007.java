import java.util.Scanner;

import ControlClasses.Control;

/* Instructions:
 * 1. Input a number with four digits
 * 2. Create a number with the thousands and units digit
 * 3. Report it 
 */

public class EXERCISE007 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int number = 0, units = 0, tens = 0;
    do {
      System.out.println(\u000C);
      // INPUT
      do {
        System.out.print("Enter a number with 4 digits: ");
        number = sc.nextInt();
      } while (number <= 999 || number > 9999);
      // PROCESS
      units = number % 10;
      tens = number / 1000;
      // OUTPUT
      System.out.println("The new number is " + (tens*10 + units));
    } while (Control.control());
  }
}
