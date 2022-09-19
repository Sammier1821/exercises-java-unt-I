package ControlClasses;

import java.util.Scanner;

public class SalarySystem {
  Scanner sc = new Scanner(System.in);

  private float totalSales;
  public float basicSalary;
  private float commission;
  private float grossSalary;
  private float discount;
  private float netSalary;
  public float commissionPercentage;
  public float discountPercentage;

  public void setTotalSales() {
    do {
      System.out.print("Input total sales: ");
      totalSales = sc.nextFloat();
    } while (totalSales < 0);
  }

  private float getCommission() {
    return commissionPercentage * totalSales;
  }

  private float getGrossSalary() {
    return basicSalary + commission;
  }

  private float getDiscount() {
    return discountPercentage * grossSalary;
  }

  private float getNetSalary() {
    return grossSalary - discount;
  }

  public void setVariables() {
    commission = getCommission();
    grossSalary = getGrossSalary();
    discount = getDiscount();
    netSalary = getNetSalary();
  }

  public void showSalary() {
    System.out.println("Basic salary: " + basicSalary);
    System.out.println("Commission: " + commission);
    System.out.println("Gross salary: " + grossSalary);
    System.out.println("Discount: " + discount);
    System.out.println("Net salary: " + netSalary);
  }
}
