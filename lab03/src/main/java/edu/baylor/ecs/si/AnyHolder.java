package edu.baylor.ecs.si;

public class AnyHolder<T> {

    private final T item;

    public AnyHolder(T item){
        this.item = item;
    }

    public T getItem() {
        return item;
    }

}
