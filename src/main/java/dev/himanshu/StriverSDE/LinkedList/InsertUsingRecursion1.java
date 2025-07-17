package dev.himanshu.StriverSDE.LinkedList;

import java.sql.SQLOutput;

public class InsertUsingRecursion1 {
    public static void main(String[] args) {
        InsertUsingRecursion1 list= new InsertUsingRecursion1();
        list.insert(0, 1);
        list.insert(1,2);
        list.insert(2,3);
        System.out.println(list.size);
        list.print();
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        private int value;
        private Node next;

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        public Node(int value){
            this.value = value;
        }
    }

    private void insert(int index, int value){
        head = insertRec(index, value, head);
    }

    private Node insertRec(int index, int value, Node current) {
        if(index == 0){
            Node temp = new Node(value, current);
            size++;
            return temp;
        }

        current.next = insertRec(index-1,value, current.next );
        return current;
    }


}
