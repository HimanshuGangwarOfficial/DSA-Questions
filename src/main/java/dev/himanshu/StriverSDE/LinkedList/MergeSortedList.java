package dev.himanshu.StriverSDE.LinkedList;

public class MergeSortedList {

    public static void main(String[] args) {

        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(4);

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(4);


        Node ans = mergeTwoLists(list1.head, list2.head);
        print(ans);

    }

    private static void print(Node node) {

        while(node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("NULL");

    }

    public static Node mergeTwoLists(Node list1, Node list2) {

        SinglyLinkedList list = new SinglyLinkedList();
        Node h1 = list1;
        Node h2 = list2;

        while(h1!=null && h2!=null){
            if(h1.value < h2.value){
                list.insertLast(h1.value);
                h1 = h1.next;
            } else{
                list.insertLast(h2.value);
                h2 = h2.next;
            }
        }

        while(h1!=null){
            list.insertLast(h1.value);
            h1 = h1.next;
        }

        while(h2!=null){
            list.insertLast(h2.value);
            h2 = h2.next;
        }

        return list.head;
    }


}
