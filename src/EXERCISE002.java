import java.util.Scanner;

/* Instructions:
 * 1. Create a height formula
 * 2. Input a time (in seconds) variable
 * 3. Calculate and reporte height
 */

public class EXERCISE002 {
  final static float G = 9.8f;
  
  public static float height(float time) {
    return (float) (0.5 * G * Math.pow(time, 2));
  }

  public static void report(float x) {
    System.out.println("The height is: " + x);
  }

  public static boolean control() {
    Scanner sc = new Scanner(System.in);
    char resp = ' ';
    do {
      System.out.print("Do you want to restart the program? (y/n): ");
      resp = sc.next().charAt(0);
    } while (resp != 'y' && resp != 'Y' && resp != 'n' && resp != 'N');
    if (resp == 'y' || resp == 'Y')
      return true;
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    float time = 0;

    do {
      System.out.print("Input time (secs): ");
      time = sc.nextFloat();

      report(height(time));
    } while (control());
  }
}
