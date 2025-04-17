//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Stack myStack = new Stack(4);


        myStack.push(5);
        myStack.push(45);
        myStack.pop();
        myStack.printAll();

        StackArrayList<Integer> myAstack = new StackArrayList<>();
        myAstack.push(43);
        myAstack.push(32);
        myAstack.push(65);
        myAstack.pop();
        myAstack.printStack();


    }
}