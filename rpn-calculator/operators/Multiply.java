package operators;

final class Multiply implements Expression {
	
	private final Expression leftOperand;
	private final Expression rightOperand;
	
	Multiply (final Expression left, final Expression right) {
		
		this.leftOperand = left;
		this.rightOperand = right;
		
	}
	
	@Override
	public double interpret() {	
		return this.leftOperand.interpret() * this.rightOperand.interpret();
	}
	
}
