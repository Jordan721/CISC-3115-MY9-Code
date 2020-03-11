import java.util.*;
public class TestExceptions {

  public static double divide(int x, int y)
  throws Exception {

    if (y == 0)
      throw new Exception("Can't perform " + x + "/0");

    return (double) x / y;
  }


  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);


    while (true) {

      System.out.print("Enter a number: ");

      int first = input.nextInt();

      System.out.print("Enter another number: ");

      int second = input.nextInt();

      if (first == 0 && second == 0)
        break;
      try {

        double result = divide(first, second);

        System.out.println(first + "/" + second +
          " = " + result);

      } catch (Exception e) {

        System.err.println(e.getMessage());

      }



    }
  }

  /*
  int first = input.nextInt();
  int second = input.nextInt();
   while(first!=0 || second!=0) {

       ...

       first = input.nextInt();

     */
}
