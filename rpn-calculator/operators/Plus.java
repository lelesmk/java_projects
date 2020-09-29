package operators;

final class Plus implements Expression {
	
	private final Expression leftOperand;
	private final Expression rightOperand;
	
	Plus (final Expression left, final Expression right) {
		
		this.leftOperand = left;
		this.rightOperand = right;
		
	}
	
	@Override
	public double interpret() {	
		return this.leftOperand.interpret() + this.rightOperand.interpret();
	}
	
}
