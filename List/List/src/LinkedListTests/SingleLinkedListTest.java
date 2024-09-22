package LinkedListTests;
import LinkedList.SingleLinkedList;

public class SingleLinkedListTest {
    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList(); // ListObj

        System.out.println("EMPTY: " + list.isEmpty());

        list.addToHead(10);
        list.addToHead(20);
        list.addToHead(30);
        list.addToHead(40);

        System.out.print("LIST: ");
        list.display();

        list.addToTail(50);

        System.out.print("LIST: ");
        list.display();

        list.removeFromHead();
        System.out.print("LIST: ");
        list.display();

        list.removeAt(1);
        System.out.print("LIST: ");
        list.display();

        list.removeByValue(20);
        System.out.print("LIST: ");
        list.display();

        System.out.println("EMPTY: " + list.isEmpty());

        System.out.println("LENGTH: " + list.length());

        System.out.println("SEARCH: " + list.searchOf(50));


    }
}
