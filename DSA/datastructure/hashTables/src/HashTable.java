import java.util.ArrayList;

public class HashTable {
    public class Node {
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }

    }

    private int size = 7;
    private Node[] dataMap;

    public HashTable() {
        dataMap = new Node[size];
    }

    public int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ": ");

            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println(" {  " + temp.key + " : " + temp.value + " }");
                temp = temp.next;
            }
        }
    }

    public void set(String key, int value) {
        // Calculate index using hash function.
        // This determines where to place the
        // key-value pair in the array.
        int index = hash(key);

        // Create a new Node to store key and value.
        // This node will be inserted into the hash table.
        Node newNode = new Node(key, value);

        // Check if slot at calculated index is empty.
        // This means no collision at this index.
        if (dataMap[index] == null) {
            // If slot is empty, place newNode here.
            // This is the case with no collision.
            dataMap[index] = newNode;
        } else {
            // If slot not empty, implie
            // For example, in a large dataset, if only a small number
            // of elements satisfy a condition, the intermediate operations
            // like filtering and mapping are only applied to those elements.s
            // collision.
            // Handle collision by chaining.

            // Start with first node in list at index.
            Node temp = dataMap[index];

            // Check if first node's key matches new key.
            // This is for updating value if key exists.
            if (temp.key.equals(key)) {
                // If keys match, update node's value.
                temp.value += value;
                // Exit method, as value for existing key
                // is updated.
                return;
            }

            // Traverse list to find matching key or
            // reach end of list.
            while (temp.next != null) {
                // Move to next node in list.
                temp = temp.next;
                // Check if current node's key matches.
                if (temp.key.equals(key)) {
                    // If keys match, update node's value.
                    temp.value += value;
                    // Exit method, as value for existing key
                    // is updated.
                    return;
                }
            }

            // If key not found in list, append new node
            // at end to handle collision.
            temp.next = newNode;
        }
    }

    public int get(String key){
        // Calculate the hash index for the key to find
        // the correct bucket in the dataMap
        int index = hash(key);
        // Access the linked list at the calculated bucket index
        Node temp = dataMap[index];
        // Iterate over the linked list
        while (temp != null) {
            // Check if current node's key matches the search key
            if (temp.key.equals(key))
                return temp.value; // Return the value if keys match
            // Move to the next node in the list
            temp = temp.next;
        }
        // Return 0 if key is not found in the map
        return 0;
    }
    public ArrayList<String> keys(){
        // Create a new ArrayList to hold the keys
        ArrayList<String> allKeys = new ArrayList<>();

        // Loop through all the indices in the dataMap array
        for (int i = 0; i < dataMap.length; i++) {
            // Get the head node of the linked list at the current index
            Node temp = dataMap[i];

            // Loop through the linked list at the current index
            while (temp != null) {
                // Add the key of the current node to the allKeys ArrayList
                allKeys.add(temp.key);

                // Move to the next node in the linked list
                temp = temp.next;
            }
        }

        // Return the ArrayList containing all the keys
        return allKeys;
    }
}