import java.lang.*;

public class SLL{
    private Node head;
    private int size;

    public SLL () {
        this.head = null;
        this.size = 0;
    }

    public void insertAtIndex (int index, int value){
        Node node = new Node(value);
        
        if (this.head == null){
            this.head = node;
        }

        else {
            Node temp = this.head;
            int i = 0;

            while (i != index - 1 && temp.getNext() != null) {
                temp = temp.getNext(); i++;
            }
            
            if (index > i + 1) {
                System.out.println("Index out of bounds.");
            }
            
            else {
                node.setNext(temp.getNext());
                temp.setNext(node);
            }
        }

        size += 1;
    }

    public int removeFromIndex (int index) {
        if (this.head == null) {
            return -999;
        }

        else {
            Node curr = head;
            Node prev = curr;

            int i = 0;

            // 0 --> 1 --> 2 --> 3 --> 4 --> null
            while (i != index && curr.getNext() != null) {
                prev.setNext(curr);
                curr.setNext(curr.getNext());

                i++;
            }

            if (index > i) return -999;

            else {
                int value = curr.getValue();
                prev.setNext(curr.getNext());
                curr = null; size -= 1;
                return value;
            }
        }
    }

    public int getSize () {
        return this.size;
    }

    public int findElement (int element) {
        if (head != null) {
            Node temp = head;
            int index = 0;

            while(temp.getValue() != element && temp != null){
                temp = temp.getNext();
                index += 1;
            }
            
            if (temp != null) return index;
            else return -1;
        }
        
        return -1;
    }

    public int valueAtIndex (int index) {
        if (index >= size) {
            return -999;
        }

        else {
            Node temp = head; int i = 0;
            while (i != index && temp != null) {
                temp = temp.getNext();
                i++;
            }
            return temp.getValue();
        }
    }

    public String convertToString () {
        String stringed = new String("");

        int index = 0;
        Node temp = head;

        while(temp != null) {
            if (index == size - 1)
                stringed += temp.getValue();

            else
                stringed += temp.getValue() + " ";
        }

        return stringed;
    }
}