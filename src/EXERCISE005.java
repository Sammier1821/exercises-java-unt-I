import ControlClasses.Control;
import MathClasses.Plane;
import MathClasses.Point;

/* Instructions:
 * 1. Input two points
 * 2. Calculate and report distance between them
 */

public class EXERCISE005 {
  public static void main(String[] args) {
    Plane plane = new Plane();
    Point a = new Point();
    Point b = new Point();

    do {
      a.setXY(1);
      b.setXY(2);
      plane.showDistance(a, b);
    } while (Control.control());
  }
}
