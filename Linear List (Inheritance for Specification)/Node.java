class Node{
    private int val;
    private Node next;

    public Node(int val){
        this.val = val;
        this.next = null;
    }

    public Node(int val, Node next){
        this.val = val;
        this.next = next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }

    public int getValue() {
        return this.val;
    }

    public int sum(){
        if (next == null)
            return val;
        else
            return val + next.sum();
    }
}