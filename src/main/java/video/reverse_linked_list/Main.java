package video.reverse_linked_list;

public class Main {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);

        printNodes(node);
        Node newHead = reverseList(node);
        System.out.println("New ");
        printNodes(newHead);
    }

    public static Node reverseList(Node head){
        Node previous = null;
        Node current = head;

        while(current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public static void printNodes(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
    }
}
