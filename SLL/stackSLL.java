public class StackSLL{
	private Node top;

	public StackSLL(){
		top = null;
	}
	
    public void push(int val){
		Node p = new Node(val);
		if(top == null){
			top = p;
		}
        else{
			
			p.setNext(top);
			top = p;
		}
	}
	
	public int pop(){
		if(top == null){
			return -1;
		}
        else{
			int element = peek();
			if(element!=-1){
				top = top.getNext();
			}else{
				top = null;
			}
			return element;
		}
	}
	
    public int peek(){
		if(top == null){
			return -1;
		}else{
			return top.getVal();
		}
	}
	
    public void print(){
		Node curr = top;
		while(curr!=null){
			System.out.print(curr.getVal()+" ");
			curr = curr.getNext();
		}
		System.out.println();
	}
}