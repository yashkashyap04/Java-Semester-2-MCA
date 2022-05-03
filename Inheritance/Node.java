class Node{
	private int val;
	private Node next;

	public Node(int v){
		val = v;
		next = null;
	}

	public Node(int v, Node n){
		val = v;
		next = n;
	}
	public void setNext(Node n){
		
		this.next = n;
		
	}
	public Node getNext(){
		return this.next;
	}
	public int getVal(){
		return val;
	}

	public int sum(){
		if (next == null)
			return val;
		else
		return val + next.sum();
	}

}
