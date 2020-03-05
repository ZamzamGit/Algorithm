package linkedlist;

import java.util.Scanner;

public class LinkedList {
    Node head;
    /*

    public int countNodes(Node head) {
        int count = 1;
        Node current = head;
        while (current.next != null) {
            current= current.next;
            count += 1;
        }
        return count;
    }

     */

    public void append(int data) {
        if(head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data) {
        if(head == null) return;
        if(head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if(current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void printList() {
        System.out.println(head.data + " " + head.next.data + " " + head.next.next.data + " "
                + head.next.next.next.data);
    }
}

class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.append(5);
        list.prepend(2);
        list.prepend(3);
        list.prepend(9);
        list.prepend(1);
        list.printList();

    }
}