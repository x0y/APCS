public class Rectangle
{
  private double length;
  private double width;
  public Rectangle()
  {
    length=1.0;
    width=1.0;
  }
  public Rectangle(double l, double w)
  {
    length=l;
    width=w;
  }
  public double computeArea()
  {
  double area;
  area=length * width;
  return area;  
  }
  public double computePerimeter()
  {
    double perimeter;
    perimeter = (length*2) + (width*2);
    return perimeter;
  }
  
}
