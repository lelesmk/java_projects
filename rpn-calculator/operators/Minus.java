package operators;

final class Minus implements Expression {
	
	private final Expression leftOperand;
	private final Expression rightOperand;
	
	Minus (final Expression left, final Expression right) {
		
		this.leftOperand = left;
		this.rightOperand = right;
		
	}
	
	@Override
	public double interpret() {	
		return this.leftOperand.interpret() - this.rightOperand.interpret();
	}
	
}
