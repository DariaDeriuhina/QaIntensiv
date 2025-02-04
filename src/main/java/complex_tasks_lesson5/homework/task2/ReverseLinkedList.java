package complex_tasks_lesson5.homework.task2;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node<>(10);
        node1.next = new Node<>(15);
        node1.next.next = new Node<>(20);

        printList(node1);

        node1 = reverseList(node1);

        printList(node1);
    }

    public static Node reverseList(Node head){
        Node previous = null;
        Node current = head;

        while(current != null){
            Node next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        return previous;
    }

    public static void printList(Node head){
        Node current = head;

        while(current!= null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }


}
