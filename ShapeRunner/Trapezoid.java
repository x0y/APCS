public class Trapezoid
{
  private double base1;
  private double base2;
  private double height;
  public Trapezoid()
  {
    base1=1.0;
    base1=1.0;
    height=1.0;
  }
  public Trapezoid(double b1, double b2, double h)
  {
    base1=b1;
    base2=b2;
    height=h;
  }
  public double computeArea()
  {
  double area;
  area=.5*height*(base1+base2);
  return area;  
  }
  
}
