package code;

public class LinkedRev {

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;

    void insertVal(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    void display(){
        Node temp =  head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    // void reverse(){
    //     Node prev = null;
    //     Node current = head;
    //     Node next = null;
    //     tail = head;
    //     while(current != null){
    //         next = current.next;
    //         current.next = prev;
    //         prev = current;
    //         current = next;
    //     }
    //     head = prev;
    // }

    void rev(){
        Node prev = null;
        Node current = head;
        Node next = null;
        tail = head;
        while(current != null){
            next =  current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args){
        LinkedRev l = new LinkedRev();
        l.insertVal(1);
        l.insertVal(2);
        l.insertVal(3);
        l.insertVal(4);
        l.insertVal(5);
        l.insertVal(6);
        l.display();
        l.rev();
        l.display();
        l.insertVal(0);
        l.display();
        l.rev();
        l.display();
    }
}
