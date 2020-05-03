public class DimensionException extends Exception{

  private double length;

  private double width;

  public DimensionException(double length, double width){

    super();
    
    this.length = length;
    this.width = width;
  }

  public String getMessage(){

    return "Error . " + width + ">" length;
  }
}
