package behavioral.interpreter_opt2;

public class PlusExpression extends Expression {

  private final Expression leftExpression;
  private final Expression rightExpression;
  
  public PlusExpression(Expression leftExpression, Expression rightExpression) {
    super();
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
  }

  @Override
  public int interpret() {
    return leftExpression.interpret() + rightExpression.interpret();
  }

  @Override
  public String toString() {
    return "+";
  }

}
