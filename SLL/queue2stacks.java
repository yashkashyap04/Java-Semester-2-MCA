public class queue2stacks {
    private stackSLL stack1;
    private stackSLL stack2;

    public queue2stacks() {
        stack1 = new stackSLL();
        stack2 = new stackSLL();
    }

    public void enqueue(int n) {
        stack1.push(n);
    }

    public int dequeue() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int ans = stack2.top();
        stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return ans;
    }

    public int front() {
        if (stack1.isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int ans = stack2.top();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return ans;
    }
}
