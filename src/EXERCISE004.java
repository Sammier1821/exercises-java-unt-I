import ControlClasses.Control;
import ControlClasses.SalarySystem;

/* Instructions:
 * 1. Input total sales
 * 2. Calculate commission, gross salary, discount and net salary
 * Data:
 * - Basic salary = 300u
 * - Gross salary = Basic salary + Commission (9% of total sales)
 * - Discount = 11% of gross salary
 * - Net salary = Gross salart - Discount
 */

public class EXERCISE004 {
  public static void main(String[] args) {
    SalarySystem salesman = new SalarySystem();
    salesman.basicSalary = 300;
    salesman.commissionPercentage = 0.09f;
    salesman.discountPercentage = 0.11f;

    do {
      salesman.setTotalSales();
      salesman.setVariables();
      salesman.showSalary();
    } while (Control.control());
  }
}