class Stack {
	// INSTANCE VARIABLES
	private int maxSize;
	private char[] sArr;
	private int topPtr;
	private boolean isFull;
	boolean isEmpty;
	
	// Constructors.
	public Stack(int n) {        // n = Max Size of the stack.
		this.maxSize = n;
		this.sArr = new char[n];
		this.topPtr = 0;
		this.isEmpty = true;
		this.isFull = false;
	}
	
	// Methods.
	public void push(char c) throws OverflowException {
		if(this.isFull){
			throw new OverflowException(this.topPtr);
		}
		else {
			this.isEmpty = false;
			this.sArr[this.topPtr] = c;
			this.topPtr++;
			if (this.topPtr >= this.maxSize) {
				this.isFull = true;
			}
		}
	}
	
	public void printStack() {
		for(int i = 0; i < this.topPtr; i++) {
			System.out.print(sArr[i] + " ");
		}
		System.out.println("");
	}
	
	public char pop() throws UnderflowException {
		char c = '\0';
		if(this.isEmpty) {
			throw new UnderflowException(this.topPtr);
		}
		else {
			this.isFull = false;
			this.topPtr--;
			c = this.sArr[this.topPtr];
			if(this.topPtr == 0) {
				this.isEmpty = true;
			}
		}
        
		return c;
	}
}

// ((())
// (