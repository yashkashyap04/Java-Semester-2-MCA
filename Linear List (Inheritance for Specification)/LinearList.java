/**
 * Abstract class LinearList - write a description of the class here
 *
 * @author Yash Kashyap
 * @version 04
 **/

public abstract class LinearList
{  
    public abstract boolean isEmpty();
    public abstract int size();
    public abstract int get(int index);
    public abstract int indexOf(int theElement);
    public abstract int remove(int index);
    public abstract void add(int index, int theElement);
    public abstract String toString();
}