public class BinarySearchTree {
    class Node{
        Node left;
        Node right;
        int value;
        Node(int value){
            this.value = value;
        }

    }
    private Node root;
    public Node getNode(){
        return root;
    }
    public boolean insert(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true){
            if(temp.value== newNode.value) return false;
            if(temp.value> newNode.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp= temp.left;
            }else{
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }
    public boolean contains(int value){
        return contains(root,value);
    }
    private boolean contains(Node currentNode, int value){
        if(currentNode == null) return false;
        if(currentNode.value == value) return true;
        if(currentNode.value>value){
            return contains(currentNode.left,value);
        }else{
            return contains(currentNode.right,value);
        }

    }
}
