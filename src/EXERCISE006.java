import ControlClasses.Control;
import ControlClasses.MoneyDivider;

/* Instructions:
 * 1. Input an amount of money (S/. Peruvian Soles)
 * 2. Show the money divided in bills and currency (S/. Peruvian Soles)
 * Data:
 * - Use S/100, S/50 and S/10 bills
 * - Use S/5, S/2 and S/1 coins
 */

public class EXERCISE006 {
  public static void main(String[] args) {
    MoneyDivider md = new MoneyDivider();
    
    do {
      md.setMoney();
      md.reportBillsAndCoins();
    } while (Control.control());
  }
}
