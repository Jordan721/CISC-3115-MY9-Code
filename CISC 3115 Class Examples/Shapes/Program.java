public class Program{

  public static void main(String[] args) throws Exception{

    Shape[] shape = new Shape[5];

    // shapes[0] = new Shape(); Error Shape is an inhertence


try{
    shapes[0] = new Circle(1);
    shapes[1] = new Rectangle(2,4);
    shapes[2] = new Rectangle(3,10);
    shpaes[3] = new Square(2);
    shapes[4] = new Circle(4);
} catch(DimensionException e){
  System.err.println("dimension error!" + e.getMessage());
}ctach(IllegalArgumentException e){
  System.err.println("illegal arument passed.");
}catch(Exception e){
  System.err.println(e.getMessage());
}
    System.out.println("There have been" + Circle.getNumCircles() + "created so far.");

    printAreas(shapes);

  }

  public static void printAreas(Shape[] shapes){

    for(int i=0; i<shapes.length; i++)
    System.out.println(shapes[i].area());
  }
}
