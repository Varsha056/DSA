
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Queues que = new Queues(7);
        que.enque(87);
        que.enque(34);
        que.enque(55);
        que.enque(98);
        que.getFirst();
        que.getLast();
        que.deque();
        que.printQueue();
        que.getLength();

    }
}