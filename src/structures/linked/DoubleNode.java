package structures.linked;

public class DoubleNode<T> extends SingleNode<T> {

    private DoubleNode<T> prev;

    public DoubleNode(T data, SingleNode<T> next, DoubleNode<T> prev) {
        super(data, next);
        this.prev = prev;
    }

    public DoubleNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode<T> prev) {
        this.prev = prev;
    }

}
