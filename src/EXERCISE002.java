import java.util.Scanner;

import ControlClasses.Control;
import MathClasses.Constant;

/* Instructions:
 * 1. Create a height formula
 * 2. Input a time (in seconds) variable
 * 3. Calculate and reporte height
 */

public class EXERCISE002 {
  public static float height(float time) {
    return (float) (0.5 * Constant.G * Math.pow(time, 2));
  }

  public static void report(float x) {
    System.out.println("The height is: " + x);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float time = 0;
    do {
      System.out.print("Input time (secs): ");
      time = sc.nextFloat();
      report(height(time));
    } while (Control.control());
    sc.close();
  }
}
