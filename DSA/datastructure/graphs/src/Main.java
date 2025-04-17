//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Graphs myGraph = new Graphs();
       myGraph.addVertex("A");
       myGraph.addVertex("B");
       myGraph.addVertex("C");
       myGraph.addVertex("D");

       myGraph.addEdge("A","C");

       myGraph.addEdge("A","B");
       myGraph.addEdge("A","D");
       myGraph.addEdge("B","D");
       myGraph.addEdge("C","D");
       myGraph.printGraph();
       myGraph.removeEdge("A","C");
       myGraph.printGraph();
        myGraph.removeVertex("D");
        myGraph.printGraph();

    }
}