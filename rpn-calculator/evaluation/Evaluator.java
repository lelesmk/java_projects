package evaluation;

import operators.Expression;
import operators.ExpressionFactory;

public class Evaluator {
	
	private final Expression termsOfEquation;
	
	public Evaluator (final String expressionText) {
		this.termsOfEquation = setTerms(expressionText);
	}
	
	public double evaluate() {
		return this.termsOfEquation.interpret();
	}
	
	private static Expression setTerms (final String expressionText) {
		return ExpressionFactory.createExpression(expressionText);
	}

}
