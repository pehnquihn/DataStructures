package structures.linked;

public class SingleNodeBuilder<T> {
    private T data = null;
    private SingleNode<T> next = null;

    public SingleNodeBuilder setData(T data) {
        this.data = data;
        return this;
    }

    public SingleNodeBuilder setNext(SingleNode<T> next) {
        this.next = next;
        return this;
    }

    public SingleNode createSingleNode() {
        return new SingleNode(data, next);
    }
}