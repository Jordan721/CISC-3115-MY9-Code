public class Rectangle implements Shape{

  private double width;
  private double length;

  public Rectangle(double width, double length){

    if(width>length){
      throw new DimensionException("Error length is < width");
      if(width <=0 || length <=0)
      throw new IllegalArgumentException();

      this.length = length;
      this.width = width;
  }


  public double perimeter(){

  return 2 * (length + width);
  }

  public double area(){
    return length* width;

  }
}
