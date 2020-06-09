package laba7;

import laba6.Plane;

public class Node {
    private Plane plane;
    private Node next;
    private Node previous;

    public Node(Plane plane, Node next, Node previous) {
        this.plane = plane;
        this.next = next;
        this.previous = previous;
    }


    public void setNext(Node next) {
        this.next = next;
    }

    public Plane getPlane() {
        return plane;
    }
    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }
}
