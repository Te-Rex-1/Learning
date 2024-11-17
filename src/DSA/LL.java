package DSA;


public class LL {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data= data;
            this.next=null;
        }
    }
        //add linked list
    void addFirst(String data){
        Node newNode=new Node(data);// creating new node
        if (head==null){// checking if node is null then assigning value to new node
        head=newNode;
        return;
        }
        newNode.next=head; // if node is not null then linking to head
        head=newNode; //
    }
    void addLast(String data){
        Node newNode=new Node(data);// creating new node
        if (head==null){// checking if node is null then assigning value to new node
            head=newNode;
            return;
        }
        Node currNode=head;
       // while (currNode)

    }

    public static void main(String[] args) {
        LL ob=new LL();

    }
}
