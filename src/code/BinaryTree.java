package code;

class BinaryTree{

    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    Node root;

    private Node addNode(Node temp, int value){
        if(temp == null){
            return  new Node(value);
        }
        if(temp.data > value){
            temp.left = addNode(temp.left, value);
        } else {
            temp.right = addNode(temp.right,  value);
        }
        return temp;
    }

    private void add(int value){
        root = addNode(root, value);
    }

    private BinaryTree createTree(){
        BinaryTree b = new BinaryTree();
        b.add(20);
        b.add(10);
        b.add(30);
        b.add(5);
        b.add(15);
        b.add(25);
        b.add(35);
        return b;
    }

    private void preOrder(Node temp){
        if( temp == null){
            return;
        }
        System.out.print(temp.data + " -> ");
        preOrder(temp.left);
        preOrder(temp.right);
    }
    private void inOrder(Node temp){
        if( temp == null){
            return;
        }
        inOrder(temp.left);
        System.out.print(temp.data + " -> ");
        inOrder(temp.right);
    }

    private void postOrder(Node temp){
        if( temp == null){
            return;
        }
        postOrder(temp.left);
        postOrder(temp.right);
        System.out.print(temp.data + " -> ");
    }

    public void print(){
        // preOrder(root);
        // System.out.println();
        inOrder(root);
        System.out.println();
        // postOrder(root);
        // System.out.println();
    }

    private boolean containsNode(Node temp, int value){
        if(temp == null){
            return false;
        }
        if ( temp.data == value){
            return true;
        }
        if(temp.data > value){
            return containsNode(temp.left, value);
        } else {
            return containsNode(temp.right, value);
        }
    }
    public boolean contains(int value){
        return containsNode(root, value);
    }
    public static void main(String[] args){
        BinaryTree b1 = new BinaryTree();
        b1 = b1.createTree();
        b1.print();
        System.out.println(b1.contains(35));
    }
}