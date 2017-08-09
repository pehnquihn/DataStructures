package structures.base;

public interface Listable<T> extends Queueable<T>, Stackable<T> {

    T shift();

    T get(int index);
    void set(int index, T payload);
    void insert(int index, T payload);

}
