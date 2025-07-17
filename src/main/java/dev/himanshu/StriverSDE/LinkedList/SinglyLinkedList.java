package dev.himanshu.StriverSDE.LinkedList;

public class SinglyLinkedList {

    public Node head;
    public Node tail;
    private int size = 0;



    public Node getHead(){
        return head;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = node;
        }

        size++;
    }

    public void insertLast(int value){

        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insert(int value, int index){

        if(head == null){
            insertFirst(value);
            return;
        }

        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

}
