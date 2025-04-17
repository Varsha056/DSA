//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        HashTable myHashTable = new HashTable();

//        myHashTable.set("nails", 100);
//        myHashTable.set("tile", 50);
//        myHashTable.set("lumber", 80);
//        myHashTable.set("bolts", 200);
//        myHashTable.set("screws", 140);
//
//        myHashTable.printTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

//        System.out.println("Lumber:");
//        System.out.println( myHashTable.get("lumber") );
//
//        System.out.println("\nBolts:");
//        System.out.println( myHashTable.get("bolts") );
        System.out.println( myHashTable.keys() );
    }
}