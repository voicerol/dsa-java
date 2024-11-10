package List;

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

    // insertion
    public void addToHead(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

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

    public void removeFromTail(){
        if (tail == null){
            return;
        }
        if (tail.prev == null){
            head = tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}
