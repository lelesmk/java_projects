package operators;

public class Power implements Expression {

	private final Expression leftOperand;
	private final Expression rightOperand;
	
	Power (final Expression left, final Expression right) {
		
		this.leftOperand = left;
		this.rightOperand = right;
		
	}
	
	@Override
	public double interpret() {	
		final double x = this.rightOperand.interpret();
        final double y = this.leftOperand.interpret();
        if(y < 0) {
            throw new UnsupportedOperationException("Not supported!");
        }
        return powerImpl(x, y);
	}

	private double powerImpl(double a, double b) {
		return b == 0 ? 1 : a * powerImpl(a, b - 1);
	}
	
}
