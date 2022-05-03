public class SLL{
private Node head;

	//Constructors
	public SLL(){
		head = null;
	}
	
	public SLL(SLL list){
		if(list.head == null){
			head = null;
		}
        
        else{
			Node curr = list.head;
			head = curr;
			Node newNode = head;
			while(curr != null){
				newNode.setNext(curr.getNext());
				curr = curr.getNext();
				newNode = newNode.getNext();
			}
			
		}
	}
	
	public Node getHead(){
		return head;
	}
	int deleteAtBegin(){
		
		if(head!=null){
			int val = head.getVal();
			head = head.getNext();
			return val;
		}else{
			head = null;
		}
		return -1;
	}
	private int findMax(Node head){
		if(head == null){
			return Integer.MIN_VALUE;
		}
		return Math.max(head.getVal(),findMax(head.getNext()));
	}
	public int findMax(){
		return findMax(head);
		
	}
	public void insertAtBegin(int v){
		Node s = new Node(v);
		if (head == null){
			head = s;
		}
		else{
			
			s.setNext(head);
			head = s;
		}
	}

	public int getSum(){
		return head.sum();
	}
	public void print(){
		while(head != null){
			System.out.print(head.getVal()+" ");
			head = head.getNext();
		}
	}
}