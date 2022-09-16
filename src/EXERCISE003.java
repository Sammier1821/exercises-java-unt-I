import java.util.Scanner;

import ControlClasses.Control;
import MathClasses.Constants;

/* Instructions:
 * 1. Use a cilinder volume formula
 * 2. Input a height (in meters)
 * 3. Calculate volume
 */

public class EXERCISE003 {
  public static float getCilinderVolume(float radius, float height) {
    return Constants.PI * (float) (Math.pow(radius, 2)) * height;
  }

  public static void report(float x) {
    System.out.println("The volume of the cilinder is " + x);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float radius = 2f, height = 0;
    do {
      System.out.print("Height value: ");
      height = sc.nextFloat();
      report(getCilinderVolume(radius, height));
    } while (Control.control());
    sc.close();
  }
}