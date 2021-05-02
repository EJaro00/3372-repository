package edu.baylor.ecs.si;

import java.util.ArrayList;
import java.util.List;

public class AnyHolderCar<T> {
    private final int SIZE = 4;
    private final List<AnyHolder<T>> carHolders = new ArrayList<>(SIZE);

    public void accept(T t){if(carHolders.size() < SIZE) carHolders.add(new AnyHolder<>(t));}

    public List<AnyHolder<T>> getCarHolders() {
        return carHolders;
    }
}
