public class AdditionExpression extends BinaryExpression {

  public AdditionExpression(Expression lhs, Expression rhs) {

    super(lhs, rhs);
  }

  public int evalute() {

    return lhs.evalute() + rhs.evalute();

  }

}
