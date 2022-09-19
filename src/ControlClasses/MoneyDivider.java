package ControlClasses;

import java.util.Scanner;

public class MoneyDivider {
  Scanner sc = new Scanner(System.in);

  private int n100Bill;
  private int n50Bill;
  private int n10Bill;
  private int n5Coin;
  private int n2Coin;
  private int n1Coin;
  private float money;

  public void setMoney() {
    do {
      System.out.print("Money to divide: ");
      money = sc.nextFloat();
    } while (money < 0);
  }

  private void setNBillsAndCoins() {
    float mny = money;
    n100Bill = (int) mny / 100;
    mny %= 100;
    n50Bill = (int) mny / 50;
    mny %= 50;
    n10Bill = (int) mny / 10;
    mny %= 10;
    n5Coin = (int) mny / 5;
    mny %= 5;
    n2Coin = (int) mny / 2;
    mny %= 2;
    n1Coin = (int) mny;
  }

  public void reportBillsAndCoins() {
    setNBillsAndCoins();
    System.out.println("S/100 bills: " + n100Bill);
    System.out.println("S/50 bills: " + n50Bill);
    System.out.println("S/10 bills: " + n10Bill);
    System.out.println("S/5 coins: " + n5Coin);
    System.out.println("S/2 coins: " + n2Coin);
    System.out.println("S/1 coins: " + n1Coin);
  }
}
