package MathClasses;

import java.util.Scanner;

public class Point {
  Scanner sc = new Scanner(System.in);
  
  public float x;
  public float y;

  public void setXY(int n) {
    System.out.print("Value for x from point " + n + ": ");
    x = sc.nextFloat();
    System.out.print("Value for y from point " + n + ": ");
    y = sc.nextFloat();
  }
}
