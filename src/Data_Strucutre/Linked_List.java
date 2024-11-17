package Data_Strucutre;

import java.util.LinkedList;

public class Linked_List {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public void   add1(int data){
        Node newNode=new Node(data);
        if (head==null){
          //  head=tail=null;
        }
        newNode.next=head;
        head=newNode;
    }


    public static void main(String[] args) {
        LinkedList l1=new LinkedList();

    }
}
