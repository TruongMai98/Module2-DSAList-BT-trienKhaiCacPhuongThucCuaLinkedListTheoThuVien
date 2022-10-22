public class Node {
    public Node next;
    private Node getNext;
    private Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }

}