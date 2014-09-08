public class Triangle
{
  private double height;
  private double base;
  public Triangle()
  {
    base=1.0;
    height=1.0;
  }
  public Triangle(double b, double h)
  {
    base=b;
    height=h;
  }
  public double computeArea()
  {
  double area;
  area=.5 * base * height;
  return area;  
  }
  
}
