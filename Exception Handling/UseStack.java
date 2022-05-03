import java.util.*;

class UseStack{

	public static boolean isParanthesisMatching(char[] expr) throws UnderflowException, OverflowException{
		int length = expr.length;
		char x = 'a';
		Stack parenthesisStack = new Stack(length);
		for(int i = 0; i < length; i++){
			if(expr[i] == '('){
				parenthesisStack.push(expr[i]);
			}
			else{
				if(expr[i] == ')'){
					x = parenthesisStack.pop();
				}
			}
		}
		return parenthesisStack.isEmpty;
	}
	
	public static void main(String[] args){
        char [] expression = {'(', '(', '(', ')', ')', ')', ')'};
		try {
			boolean isMatch = isParanthesisMatching(expression);
		}
		catch (OverflowException exception) {
			System.out.println("Overflow Exception caused.\n" + exception.toString());
		}
		catch (UnderflowException exception) {
			System.out.println("Underflow Exception caused.\n" + exception.toString());
		}

		System.out.println("\n-----------------------------------------------\n");
		
		try {
			Stack stack = new Stack(3);
			System.out.println("Pushing A to the new Stack.");
			stack.push('A'); System.out.println("A pushed\n");

			System.out.println("Pushing B to the new Stack.");
			stack.push('B'); System.out.println("B pushed\n");
			
			System.out.println("Pushing C to the new Stack.");
			stack.push('C'); System.out.println("C pushed\n");
			
			System.out.println("Pushing D to the new Stack.");
			stack.push('D'); System.out.println("D pushed\n");
		}
		catch (OverflowException exception) {
			System.out.println(exception.toString());
		}
	}
}
