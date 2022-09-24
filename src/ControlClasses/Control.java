package ControlClasses;

import java.util.Scanner;

public class Control {
  public static Scanner sc = new Scanner(System.in);
  
  public static boolean control() {
    char resp = ' ';
    do {
      System.out.print("\nDo you want to restart the program? (y/n): ");
      resp = sc.next().charAt(0);
    } while (resp != 'y' && resp != 'Y' && resp != 'n' && resp != 'N');
    if (resp == 'y' || resp == 'Y')
      return true;
    return false;
  }
}
