package operators;

public class Divide implements Expression {

	private final Expression leftOperand;
	private final Expression rightOperand;
	
	Divide (final Expression left, final Expression right) {
		
		this.leftOperand = left;
		this.rightOperand = right;
		
	}
	
	@Override
	public double interpret() {	
		final double numerator = this.rightOperand.interpret();
        final double denominator = this.leftOperand.interpret();
        if(denominator == 0) {
            throw new ArithmeticException("Divide by zero!");
        }
        return numerator / denominator;
	}
	
}
