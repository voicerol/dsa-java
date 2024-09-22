package LinkedList;

public class DoubleLinkedList {
    private static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void addToTail(int value) {
        Node node = new Node(value);

        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void removeFromHead() {
        if (head == null) {
            return;
        }

        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
