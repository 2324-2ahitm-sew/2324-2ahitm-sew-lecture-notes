package at.htlleonding.stack;


public class Stack {
    private Node head;

    //region Constructors
    public Stack(Node head) {
        this.head = head;
    }

    public Stack() {
    }
    //endregion

    //region Getter and Setter
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
    //endregion

    public void push(Object payload) {
//        Node node = new Node();
//
//        node.setPayload(payload);
//        node.setNext(head);
//        head = node;

        head = new Node(head, payload);


    }

    public Object pop() {
        if (head == null) {
            throw new RuntimeException("Stack is empty.");
        }
        Object payload = head.getPayload();
        head = head.getNext();
    return payload;
    }

    public Object peek() {
        return head.getPayload();
    }
}
