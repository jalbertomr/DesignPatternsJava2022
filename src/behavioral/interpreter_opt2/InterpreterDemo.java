package behavioral.interpreter_opt2;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// reference https://java-design-patterns.com/patterns/interpreter/#

public class InterpreterDemo {

  public static void main(String[] args) {
    final String tokenString = "4 3 2 - 1 + *";
    
    Stack<Expression> stack = new Stack<Expression>();

    String[] tokenList = tokenString.split(" ");
    
    for ( String token : tokenList) {
      if(isOperator(token)) {
        Expression rightExpression = (Expression) stack.pop();
        Expression leftExpression = (Expression) stack.pop();
        System.out.println("Popped from stack left: " + leftExpression.interpret() + " right: " + rightExpression.interpret());
        Expression operator;
        try {
          operator = getOperatorInstance( token, leftExpression, rightExpression);
          System.out.println("operator: " + operator);
          int result = operator.interpret();
          Expression resultExpression = new NumberExpression(result);
          stack.push(resultExpression);
          System.out.println("push result to stack: " + resultExpression.interpret());
        } catch (Exception e) {
          e.printStackTrace();
        }
      } else {
        Expression intExpression = new NumberExpression(token);
        stack.push(intExpression);
        System.out.println("push to stack: " + intExpression.interpret());
      }
      System.out.println("stack: " + stack);
    }
    System.out.println("result: " + ((Expression) (stack.peek())).interpret());
  }

  private static Expression getOperatorInstance(String token, Expression leftExpression,
      Expression rightExpression) throws Exception {
    switch(token) {
      case "+":
        return new PlusExpression(leftExpression,rightExpression);
      case "-":
        return new MinusExpression(leftExpression,rightExpression);
      case "*":
        return new MultiplyExpression(leftExpression,rightExpression);
      default:
        throw new Exception("Operator not allowed");
    }
  }

  private static boolean isOperator(String token) {
    Pattern operators = Pattern.compile("[*+-]");
    Matcher hasOperator = operators.matcher( token);
    return hasOperator.find();
  }

}
