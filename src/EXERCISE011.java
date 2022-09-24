import ControlClasses.Control;

/* Instructions:
 * Determine if an A number is divisible by a B number
 */

public class EXERCISE011 {
  public static void main(String[] args) {
    int aNumber, bNumber;
    do {
      Control.clearTerminal();
      // INPUT
      do {
        System.out.print("Enter the A number: ");
        aNumber = Control.sc.nextInt();
      } while (aNumber <= 0);
      do {
        System.out.print("Enter the B number: ");
        bNumber = Control.sc.nextInt();
      } while (bNumber <= 0);
      // PROCESS + OUTPUT
      if (aNumber % bNumber == 0)
        System.out.println(aNumber + " is divisible by " + bNumber);
      else
        System.out.println(aNumber + " is not divisible by " + bNumber);
    } while (Control.control());
  }
}
