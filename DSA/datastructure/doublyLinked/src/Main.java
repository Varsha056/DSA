//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedlist myDLL = new DoublyLinkedlist(7);


        myDLL.append(3);
        myDLL.append(4);
        myDLL.prepend(56);
        System.out.println("\nDoubly Linked List:");
//        myDLL.removeLast();
//        myDLL.removeFirst();
        myDLL.printList();
//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();
//        myDLL.prepend(43);
//        myDLL.set(2,98);
//        System.out.println(myDLL.get(0).value);
//        myDLL.insert(4,53);
        myDLL.remove(1);
        System.out.println("After change .......");
        myDLL.printList();
    }
}