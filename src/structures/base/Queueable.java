package structures.base;

public interface Queueable<T> extends Collection<T> {

    void unshift(T payload);

}
