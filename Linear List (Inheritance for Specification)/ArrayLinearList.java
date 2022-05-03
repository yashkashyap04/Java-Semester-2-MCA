import java.lang.*;

public class ArrayLinearList extends LinearList {
    private int array[];
    private int length;

    public ArrayLinearList () {
        this.length = 10;
        this.array = new int[length];
    }

    public ArrayLinearList (int length) {
        this.length = length;
        this.array = new int[length];
    }

    public boolean isEmpty() {
        for (int i = 0; i < this.length; i++) {
            if (array[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public int length () {
        return this.length;
    }

    public int get (int index) {
        return this.array[index];
    }

    public int indexOf (int theElement) {
        for (int i = 0; i < this.length(); i++) {
            if (this.array[i] == theElement) return i;
        }

        return -1;
    }

    public int remove (int index) {
        if (index >= this.length()) return -1;
        else {
            int i;
            for (i = index; i < this.length() - 1; i++) {
                this.array[i] = this.array[i + 1];
            }
            this.length -= 1;
            return i;
        }
    }
    
    public void add (int index, int theElement) {
        if (index < length) {
            if (this.array[index] == 0)
                this.array[index] = theElement;
            else
                System.out.println("Array index occupied.");
        }
        else {
            System.out.println("Invalid index.");
        }
    }

    public String toString () {
        String stringed = new String("");
        for (int i = 0; i < this.length(); i++){
            if (i != this.length() - 1) {
                stringed += Integer.toString(this.array[i]) + " ";
            }

            else {
                stringed += Integer.toString(this.array[i]);
            }
        }
        return stringed;
    }
} 