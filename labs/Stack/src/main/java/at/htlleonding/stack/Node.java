package at.htlleonding.stack;

public class Node {
    private Node next;
    private Object payload;

    public Node(Node next, Object payload) {
        this.next = next;
        this.payload = payload;
    }

    public Node() {
    }


    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return String.format("%s", payload.toString());
    }
}
