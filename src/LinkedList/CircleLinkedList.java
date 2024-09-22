package LinkedList;
public class CircleLinkedList {
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void addToHead(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            head.next = head;
        } else {
            node.next = head.next;
            head.next = node;
        }
    }

    public void removeFromHead() {
        if (head == null) {
            return;
        }

        Node temp = head;
        head = head.next;
        head.next = temp;
        temp.next = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}