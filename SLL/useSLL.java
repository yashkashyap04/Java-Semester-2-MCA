public class useSLL {
    public static void main(String[] args) {
        SLL linked = new SLL();

        linked.insertAtBegin(1);
        linked.insertAtBegin(2);
        linked.insertAtBegin(3);
        linked.deleteAtBegin();

        SLL newList = new SLL(linked);
        linked.insertAtBegin(10);
        System.out.println("Total sum of values in list is " + linked.getSum());
        System.out.println("Max value in list is " + linked.findMax());
    }
}
