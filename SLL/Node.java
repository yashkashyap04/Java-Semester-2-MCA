class Node{

    private int value;
    private Node next;

    public Node(int value){
        this.value = value;
        next = null;
    }

    public Node(int v, Node node){
        val = v;
        next = n;
    }

    public void setNext(Node node){
        this.next = node;
    }

    public int sum(){
        if (next == null)
            return value;
        else
            return val + next.sum();
    }
}