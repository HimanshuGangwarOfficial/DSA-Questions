package dev.himanshu.StriverSDE.LinkedList;

public class RemoveDuplicatesOptimal {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);

        list.print();
        removeDuplicates(list.getHead());
        System.out.println();
        list.print();
    }

    public static void removeDuplicates(Node head){

        Node temp = head;

        while(temp.next != null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
            } else{
                temp = temp.next;
            }

        }

    }


}
