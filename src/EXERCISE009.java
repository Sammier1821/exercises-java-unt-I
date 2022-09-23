import java.util.Scanner;

import ControlClasses.Control;

/* Instructions:
 * 1. Determine the price of gasoline
 * Data:
 * - The pump register in gallons
 * - The price per liter is 3.86
 * - One gallon equals to 3.785 liters
 */

public class EXERCISE009 {
  public static Scanner sc = new Scanner(System.in);
  
  public static float LITERS_PER_GALLON = 3.785f;

  public static float PRICE_PER_LITER = 3.86f;

  public static void main(String[] args) {
    int nGallon = 0;
    float price = 0;
    do {
      // INPUT
      do {
        System.out.print("Number of gallons: ");
        nGallon = sc.nextInt();
      } while (nGallon <= 0);
      // PROCESS
      price = nGallon * LITERS_PER_GALLON * PRICE_PER_LITER;
      // OUTPUT
      System.out.println("The price is: " + price);
    } while (Control.control());
  }
}
