public class UseStack{
	public static void main(String[] args){
		StackSLL stack = new StackSLL();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
		
        System.out.print("Printing Elements: ");
        
        stack.print();
        
        System.out.println("Pop from stack: " + stack.pop());
        System.out.println("Pop from stack: " + stack.pop());
        System.out.println("Pop from stack: " + stack.pop());
		System.out.print("Printing Elements: ");
		
        stack.print();
	}
}