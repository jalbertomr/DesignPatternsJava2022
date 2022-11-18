package behavioral.interpreter;

import java.util.Map;

public class Interpreter {
	@FunctionalInterface
	public interface Expression {
		int interpreter(Map<String, Integer> context);
		
		static Expression number(int number) {
			return context -> number;
		}
		
		static Expression plus( Expression left, Expression right) {
			return context -> left.interpreter(context) + right.interpreter(context);
		}
		
		static Expression minus( Expression left, Expression right) {
			return context -> left.interpreter(context) - right.interpreter(context);
		}
		
		static Expression variable( String name) {
			return context -> context.getOrDefault( name, 0);
		}
	}
}
