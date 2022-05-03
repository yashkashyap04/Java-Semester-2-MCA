public class useQueue2stacks {
    public static void main(String[] args) {
        queue2stacks q = new queue2stacks();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(50);
        q.enqueue(60);
        q.dequeue();
        q.dequeue();
        q.dequeue();

        System.out.println(q.front());
    }
}
