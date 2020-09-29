import java.util.Scanner;

import evaluation.Evaluator;


class RPN {
	
	private static Scanner input;

	/*
	public static void evalRPN(String expression) {
		
		String cleanedExpr = cleanExpr(expression);
		
		Stack<Double> numberStack = new Stack<Double>(); // values not operated on yet
		
		System.out.println("Input\tOperation\tStack after");
		
		for(String token:cleanedExpr.split("\\s")) {
			System.out.print(token + "\t");;
			Double tokenNum = null;
			
			try {
				tokenNum = Double.parseDouble(token); // convert text to number
			}catch(NumberFormatException e) {}
			
			// if token is a number
			if(tokenNum != null) {
				System.out.print("Push\t\t");
				// ...push it to the stack
				numberStack.push(Double.parseDouble(token + "")); 
			}else if(token.equals("+")) {
				System.out.print("Operate\t\t");
				// ...pop operands from stack and compute operation
				double operand2 = numberStack.pop();
				double operand1 = numberStack.pop();
				// ...push result to the stack
				numberStack.push(operand1 + operand2);
			}else if(token.equals("-")) {
				System.out.print("Operate\t\t");
				// ...pop operands from stack and compute operation
				double operand2 = numberStack.pop();
				double operand1 = numberStack.pop();
				// ...push result to the stack
				numberStack.push(operand1 - operand2);
			}else if(token.equals("*")) {
				System.out.print("Operate\t\t");
				// ...pop operands from stack and compute operation
				double operand2 = numberStack.pop();
				double operand1 = numberStack.pop();
				// ...push result to the stack
				numberStack.push(operand1 * operand2);
			}else if(token.equals("/")) {
				System.out.print("Operate\t\t");
				// ...pop operands from stack and compute operation
				double operand2 = numberStack.pop();
				double operand1 = numberStack.pop();
				// ...push result to the stack
				numberStack.push(operand1 / operand2);
			}else if(token.equals("^")) {
				System.out.print("Operate\t\t");
				// ...pop operands from stack and compute operation
				double operand2 = numberStack.pop();
				double operand1 = numberStack.pop();
				// ...push result to the stack
				numberStack.push(Math.pow(operand1, operand2));
			}else {
				System.out.println("Unrecognized token: " + token);
			}
			System.out.println(numberStack);
			
		}
		// ...the last item on the stack is the result
		System.out.printf("Answer is %f\n", numberStack.pop());
	}
	
	private static String cleanExpr(String expr){
		//remove all non-operators, non-whitespace, and non digit chars
		return expr.replaceAll("[^\\^\\*\\+\\-\\d/\\s]", "");
	}
	
	*/
	/* main method */
	public static void main(String args[]) {
		
		while(true) {
			
			input = new Scanner(System.in);
			
			System.out.println("Enter RPN expression or \"quit\".");
			
			
			String expression = input.nextLine();
			
			if(expression.equals("quit")) {
				break;
			} else {
				Evaluator evaluator = new Evaluator(expression);
				double result = evaluator.evaluate();
				System.out.printf("Answer is %.2f\n", result);
			}
		} 
	}
}







