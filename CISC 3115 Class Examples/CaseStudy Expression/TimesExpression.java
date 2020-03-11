public class TimesExpresion extends BinaryExpression {

  public TimesExpresion(Expression lhs, Expression rhs) {

    super(lhs, rhs);

  }

  public int evalute() {
    return lhs.evalute() * rhs.evalute();


  }

}
