public class Program {

  public static void main(String[] args) {

    Expression e1 = new Constant(5);
    Expression e2 = new AdditionExpression(new Constant(3), new Constant(4));

    System.out.println(e1.evalute());

    e3 = new AdditionExpression(new AdditionExpression(new Constant(2), new Constant(3), new TimesExpresion(new Constant4),
        new AdditionExpression(new Constant(6), new Constant(7)));

      System.out.println(e3.evalute());

    }


  }
