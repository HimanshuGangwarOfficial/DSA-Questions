package dev.himanshu.StriverSDE.LinkedList;

public class CycleDetection {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(0);
        list.insertLast(-4);

        /*
        * We have to create a linked list in which cycle is present
        * Right now able linked list does not contain cycle.
        * We have to modify it accordingly
        * So I just ran the solution directly on leetcode
        *  */


        boolean ans = hasCycle(list.head);
        System.out.println(ans);

    }

    public static boolean hasCycle(Node head) {

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
