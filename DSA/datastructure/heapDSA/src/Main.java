//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Heap myHeap = new Heap();
        myHeap.insert(99);
        myHeap.insert(75);
        myHeap.insert(81);
        myHeap.insert(58);
        myHeap.insert(65);
        myHeap.insert(50);
        myHeap.insert(60);


        System.out.println(myHeap.getHeap());


//        myHeap.insert(100);

        System.out.println(myHeap.getHeap());


//        myHeap.insert(75);

        System.out.println(myHeap.getHeap());
        myHeap.remove();
        System.out.println(myHeap.getHeap());

    }
}