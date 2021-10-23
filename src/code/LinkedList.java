package code;

public class LinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addNode (int data){
        Node newNode = new Node(data);
        if(head == null){
            head  = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            Node temp = head;
            head = newNode;
            head.next = temp; 
        }
    }

    public void displayNode(){
        Node current = head;
        if(head == null){
            System.out.println("Linked List is empty. Add Some Elements ... ");
            return;
        }
        else{
            System.out.println("The list is:");
            while(current != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
        }
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.insertAtBeginning(0);
        ll.displayNode();
    }
}
