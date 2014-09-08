public class Circle
{
  private double radius;
  public Circle()
  {
    radius=1.0;;
  }
  public Circle(double r)
  {
    radius=r;
  }
  public double computeArea()
  {
  double area;
  area=radius * radius * Math.PI;
  return area;  
  }
  public double computePerimeter()
  {
    double perimeter;
    perimeter = radius * 2 * Math.PI;
    return perimeter;
  }
  
}
