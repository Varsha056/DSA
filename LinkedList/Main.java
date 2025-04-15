
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Linkedlist myLinkedList = new Linkedlist(4);


//        myLinkedList.append(5);
//        myLinkedList.append(6);
//        myLinkedList.append(3);
//        myLinkedList.printList();
        System.out.println("\nLinked List:");
//        System.out.println("removed Node: "+ myLinkedList.removeLast().value);
//        myLinkedList.printList();
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
        myLinkedList.prepend(7);
//        myLinkedList.printList();
//        myLinkedList.getHead();
        myLinkedList.getLength();
//        System.out.println("removed Node: "+ myLinkedList.removeFirst().value);
        myLinkedList.printList();
//        System.out.println(myLinkedList.get(0).value);
        myLinkedList.set(1,9);
        System.out.println("set value after");
        myLinkedList.printList();

        System.out.println("Inserted Node:  "+  myLinkedList.insert(2,6));
//        myLinkedList.printList();
//        System.out.println("Removed node "+myLinkedList.remove(0).value);

        myLinkedList.insert(2,23);
        myLinkedList.printList();
        myLinkedList.reverse();
        System.out.println("reversed");
        myLinkedList.printList();

    }
}
