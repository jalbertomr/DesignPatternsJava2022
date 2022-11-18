package behavioral.interpreter;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import behavioral.interpreter.Interpreter.Expression;

public class InterpreterDemo {

	public static void main(final String[] args) {
		Expression expression = parse("w x z - +");
		Map<String, Integer> context = Stream.of(
		new AbstractMap.SimpleEntry<>("w", 5), 
		new AbstractMap.SimpleEntry<>("x", 10),
		new AbstractMap.SimpleEntry<>("z", 42)
		).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		int result = expression.interpreter( context);
		System.out.println(result);
	}

	private static Expression parseToken( String token, ArrayDeque<Expression> stack) {
		Expression left, right;
		switch( token) {
		case "+":
			right = stack.pop();
			left = stack.pop();
			return Expression.plus(left, right);
		case "-":
			right = stack.pop();
			left = stack.pop();
			return Expression.minus(left, right);
		default:
			return Expression.variable(token);
		}
	}
		
	public static Expression parse(String expression) {
		ArrayDeque<Expression> stack = new ArrayDeque<Expression>();
		for (String token : expression.split(" ")) {
			stack.push( parseToken( token, stack));
		}
		return stack.pop();
	}
	
}
