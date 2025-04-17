//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Stacks st = new Stacks(7);
        st.getHeight();
        st.push(45);
        st.push(34);
        st.push(23);
        st.pop();
        st.printStack();
    }
}