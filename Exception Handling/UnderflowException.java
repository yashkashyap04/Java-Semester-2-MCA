public class UnderflowException extends Exception {
    private int top;

    public UnderflowException (int top) {
        this.top = top;
    }

    public String toString () {
        return "The stack is EMPTY. Value of top: " + this.top + ".";
    }
}