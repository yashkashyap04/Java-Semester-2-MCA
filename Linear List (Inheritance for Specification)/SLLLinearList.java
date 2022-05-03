import java.lang.*;

public class SLLLinearList extends LinearList {
    private SLL linkedList;

    public SLLLinearList () {
        this.linkedList = new SLL();
    }

    public boolean isEmpty () {
        if (this.linkedList.getSize() != 0) return false;
        else return true;
    }

    public int size () {
        return this.linkedList.getSize();
    }

    public int get(int index) {
        return this.linkedList.valueAtIndex(index);
    }

    public int indexOf(int theElement) {
        return this.linkedList.findElement(theElement);
    }

    public int remove (int index) {
        return this.linkedList.removeFromIndex(index);
    }

    public void add(int index, int theElement) {
        // System.out.println("here");
        this.linkedList.insertAtIndex(index, theElement);
    }

    public String toString() {
        return this.linkedList.convertToString();
    }
}