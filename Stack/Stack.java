class Stack {
    private int top, capacity;
    private char array[];

    public Stack() {
        this.top = -1;
        this.capacity = 10;
    }

    public Stack(int capacity) {
        this.top = -1;
        this.capacity = capacity;
    }

    public boolean checkStack() {
        if (top == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void push(char value) {
        if (top == capacity - 1) {
            System.out.println("Overflow");
        }
        else {
            top += 1;
            array[top] = value; 
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        }
        else {
            System.out.println(array[top]);
            top -= 1;
        }
    }

    public int peek() {
        return top;
    }

    public void display() {
        for (int i = capacity - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}