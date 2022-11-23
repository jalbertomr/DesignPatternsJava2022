package behavioral.interpreter_opt2;

public class NumberExpression extends Expression {

  private final int number;
  
  public NumberExpression(int number) {
    this.number = number;
  }

  public NumberExpression(String string) {
    this.number = Integer.parseInt(string);
  }
  
  @Override
  public int interpret() {
    return number;
  }
  
  @Override
  public String toString() {
    return "number";
  }
}
