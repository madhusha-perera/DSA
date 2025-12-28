/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package submission2;


class SinglyLinkedList {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    void insertEnd(int x) {
        Node n = new Node(x);
        if (head == null) {
            head = n;
            return;
        }
        Node t = head;
        while (t.next != null)
            t = t.next;
        t.next = n;
    }

    void delete(int x) {
        if (head == null) return;

        if (head.data == x) {
            head = head.next;
            return;
        }

        Node t = head;
        while (t.next != null && t.next.data != x)
            t = t.next;

        if (t.next != null)
            t.next = t.next.next;
    }
}
