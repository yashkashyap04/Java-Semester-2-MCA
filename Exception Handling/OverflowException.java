public class OverflowException extends Exception {
    private int top;

    public OverflowException (int top) {
        this.top = top;
    }

    public String toString () {
        return "The stack is FULL. Value of top: " + this.top + ".";
    }
}