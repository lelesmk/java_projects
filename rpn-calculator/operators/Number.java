package operators;


final class Number implements Expression {
	
	private final double number;
	
	private Number(double number) {
		this.number = number;
	}
	
	@Override
	public double interpret() {
		return this.number;
	}
	
	static Number valueOf(double number) {
		return new Number(number);
	}


}
