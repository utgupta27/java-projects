package code;

public class TopViewBST {
    class Node{
        int value;
        Node left, right;
        Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    private Node root;

    private Node insert(Node temp,int data){
        Node newData = new Node(data);
        if(root == null){
            return newData;
        } 
            if( temp.value > data){
                temp.left = insert(temp.left, data);
            } else {
                temp.right = insert(temp.right, data);
            }
        
        return temp;
    }

    protected void doInsert(int data){
        root  = insert(root, data);
    }

    public TopViewBST drive(){
        TopViewBST tb = new TopViewBST();
        tb.doInsert(20);
        tb.doInsert(10);
        tb.doInsert(30);
        tb.doInsert(35);
        return tb;
    }


    public static void main(String[] args){
        
    }
}
