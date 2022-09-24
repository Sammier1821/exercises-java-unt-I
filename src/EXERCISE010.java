import java.util.Scanner;

import ControlClasses.Control;

/* Instructions:
 * 1. Calculate interest from a capital, an interest rate (expressed 
 * in percentage) and a number of periods
 * Data:
 * - Amount = Capital * (1 + rate/100)^Period Count
 * - Interest = Amount - Capital
 */

public class EXERCISE010 {
  public static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    float capital, interestRate, interest;
    int nYears;
    do {
      System.out.println("\033[H\033[2J");
      System.out.flush();
      // INPUT
      do {
        System.out.print("Enter a capital: ");
        capital = sc.nextFloat();
      } while (capital <= 0);
      do {
        System.out.print("Enter the interest rate (where 1 equals 1%): ");
        interestRate = sc.nextFloat();
      } while (interestRate <= 0);
      do {
        System.out.print("Enter a number of periods (year/s): ");
        nYears = sc.nextInt();
      } while (nYears <= 0);
      // PROCESS
      interest = capital * (float) Math.pow((1 + interestRate / 100), nYears) - capital;
      // OUTPUT
      System.out.println("The generated interest is: " + interest);
    } while (Control.control());
  }  
}
