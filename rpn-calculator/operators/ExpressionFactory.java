package operators;

import java.util.Stack;


public class ExpressionFactory {

	private static final String EXPRESSION_DELIMITER = " ";
	private static final String PLUS_TOKEN = "+";
	private static final String MINUS_TOKEN = "-";
	private static final String MULTIPLY_TOKEN = "*";
	private static final String DIVIDE_TOKEN = "/";
	private static final String POWER_TOKEN = "^";

	private ExpressionFactory() {	
		throw new RuntimeException("Not instantiable!");
	}

	public static Expression createExpression(String expression) {

		String cleanedExpr = cleanExpr(expression);

		Stack<Expression> numberStack = new Stack<>(); // values not operated on yet

		System.out.println("Input\tOperation\tStack after");

		for(String token : cleanedExpr.split(EXPRESSION_DELIMITER)) {
			System.out.print(token + "\t");;
			
			numberStack.push(createSubExpression(token, numberStack));
		}
		// ...the last item on the stack is the result
		return numberStack.pop();
	}
	
	private static Expression createSubExpression(String token, Stack<Expression> numberStack) {
			
			Expression subExpression;
			
			
			switch(token) {
				case PLUS_TOKEN :
					subExpression = new Plus(numberStack.pop(), numberStack.pop());
					break;
				case MINUS_TOKEN :
					subExpression = new Minus(numberStack.pop(), numberStack.pop());
					break;
				case MULTIPLY_TOKEN :
					subExpression = new Multiply(numberStack.pop(), numberStack.pop());
					break;
				case DIVIDE_TOKEN :
					subExpression = new Divide(numberStack.pop(), numberStack.pop());
					break;
				case POWER_TOKEN :
					subExpression = new Power(numberStack.pop(), numberStack.pop());
					break;
				default :
					subExpression = createVariables(token);
					break;
			}
			return subExpression;
		}
	
	// convert text to number
	private static Expression createVariables(String token) {		
		try {
			return Number.valueOf(Double.parseDouble(token)); 
		}catch(NumberFormatException e) {}
		return null;
	}
	
	//remove all non-operators, non-whitespace, and non digit chars
	private static String cleanExpr(String expr){
		return expr.replaceAll("[^\\^\\*\\+\\-\\d/\\s]", "");
	}

}
