package complex_tasks_lesson5.homework.task2;

public class Node<T> {
    Node next;
    T value;

    public Node(T value) {
        this.next = null;
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
