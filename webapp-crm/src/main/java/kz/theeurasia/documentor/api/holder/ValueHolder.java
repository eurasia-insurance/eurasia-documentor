package kz.theeurasia.documentor.api.holder;

public interface ValueHolder<T> {
    void reset();

    T getValue();

    void setValue(T value);
}
