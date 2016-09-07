package kz.theeurasia.documentor.api.holder;

public interface ValueHolder<T> {
    T getValue();

    void setValue(T value);
}
