public class Queues {
    // Declare instance variables for the Queue class
    private Node first;
    // Pointer to the first node in the queue
    private Node last;
    // Pointer to the last node in the queue
    private int length;
    // Number of nodes in the queue

    // Define a nested class called Node to represent a single node in the queue
    class Node {
        int value;
        // Value stored in the node
        Node next;
        // Pointer to the next node in the queue

        Node(int value) {
            this.value = value;
        }
    }

    // Define a constructor for the Queue class,
    // which initializes the queue with a single value
    public Queues(int value) {
        Node newNode = new Node(value);
        // Create a new node with the specified value
        first = newNode;
        // Set both the head and tail to the new node since
        // it is the only node in the queue
        last = newNode;
        // The length of the queue is 1, since there is only one node
        length = 1;
    }

    public void enque(int value){
        // Create a new node with the given value
        Node newNode = new Node(value);

        // If the queue is empty, set the new node to be both the first and last element
        if (length == 0) {
            first = newNode;
            last = newNode;
        }

        // Otherwise, add the new node to the end of the queue
        else {
            // Set the next pointer of the current last node to the new node
            last.next = newNode;

            // Update the last pointer to point to the new node
            last = newNode;
        }

        // Increment the length of the queue to reflect the addition of the new element
        length++;
    }

    public  Node deque(){
        // If the queue is empty, return null
        if(length == 0) return null;
        // Save a reference to the first node
        Node temp = first;
        // If there is only one node in the queue, set both first and last to null
        if(length == 1) {
            first = null;
            last = null;
        } else {
            // Otherwise, set the first node to be the next node in the queue
            first = first.next;
            // Set the next pointer of the removed node to null
            temp.next = null;
        }
        // Decrease the length of the queue by 1
        length--;
        // Return the removed node
        return temp;

    }

    public void getFirst() {
         System.out.println("First - " + first.value);
    }
    public void getLast(){
        System.out.println("Last - " + last.value);
    }
    public void getLength(){
        System.out.println("Length - " +length);
    }
    public void printQueue(){
        System.out.println("Queue - ");
        Node temp = first;
        while(temp!=null){
            System.out.println(temp.value);
            temp= temp.next;
        }
    }
}
