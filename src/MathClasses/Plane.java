package MathClasses;

public class Plane {
  public float getDistance(Point a, Point b) {
    return (float) Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
  }

  public void showDistance(Point a, Point b) {
    System.out.println("Distance: " + getDistance(a, b));
  }
}
