package kz.theeurasia.documentor.beans.holder;

import java.io.Serializable;

import kz.theeurasia.documentor.api.holder.ValueHolder;

public abstract class DefaultValueHolder<T> implements Serializable, ValueHolder<T> {
    private static final long serialVersionUID = 2619035175557284058L;

    protected T value;

    // GENERATED

    @Override
    public T getValue() {
	return value;
    }

    @Override
    public void setValue(T value) {
	this.value = value;
    }
}
