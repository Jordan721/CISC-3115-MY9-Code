public abstract class BinaryExpression implements Expression {

  protected Expression lhs;

  protected Expression rhs;

  public BinaryExpression(Expression lhs, Expression rhs) {

    this.lhs = lhs;
    this.rhs = rhs;
  }

  public int evalute();
}
