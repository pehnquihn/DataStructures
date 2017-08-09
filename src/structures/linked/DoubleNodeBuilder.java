package structures.linked;

public class DoubleNodeBuilder<T> {
    private T data = null;
    private SingleNode<T> next = null;
    private DoubleNode<T> prev = null;

    public DoubleNodeBuilder setData(T data) {
        this.data = data;
        return this;
    }

    public DoubleNodeBuilder setNext(SingleNode<T> next) {
        this.next = next;
        return this;
    }

    public DoubleNodeBuilder setPrev(DoubleNode<T> prev) {
        this.prev = prev;
        return this;
    }

    public DoubleNode createDoubleNode() {
        return new DoubleNode(data, next, prev);
    }
}