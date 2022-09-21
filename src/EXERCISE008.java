import java.util.Scanner;

import ControlClasses.Control;

/* Instructions:
 * 1. Input a number with 3 digits
 * 2. Create the inverted number
 * 3. Report it
 */

public class EXERCISE008 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int number = 0, nNumber = 0;
    do {
      nNumber = 0;
      // INPUT
      do {
        System.out.print("Enter a number with 3 digits: ");
        number = sc.nextInt();
      } while (number <= 99 || number > 999);
      // PROCESS
      nNumber += (number % 10) * 100;
      nNumber += ((number / 10) % 10) * 10;
      nNumber += number / 100;
      // OUTPUT
      System.out.println("The new number is " + nNumber);
    } while (Control.control());
  }
}
