package data_structures_lesson3.classwork;

public class TaskList {
    public static void main(String[] args) {
        Node node1 = new Node("01");
        node1.next = new Node("02");
        node1.next.next = new Node("03");

        printList(node1);
        node1 = revertList(node1);
        System.out.println();
        printList(node1);
    }

    public static Node revertList(Node node){
        Node previous = null;
        Node current = node;

        while (current!=null) {
            Node next = current.getNext();
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public static void printList(Node head){
        Node current = head;
        while (current!=null){
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
    }
}

class Node<T>{
    T value;
    Node next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
