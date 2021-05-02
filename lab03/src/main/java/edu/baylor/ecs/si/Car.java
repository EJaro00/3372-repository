package edu.baylor.ecs.si;

import java.util.ArrayList;
import java.util.List;

public class Car implements BicycleVisitor{

    private final int SIZE = 4;
    private final List<BicycleHolder> carHolders = new ArrayList<>(SIZE);

    public void accept(Bicycle b){ if(carHolders.size() < SIZE) carHolders.add(new BicycleHolder(b));}

    public void accept(MountainBike b){if(carHolders.size() < SIZE) carHolders.add(new MountainBikeHolder(b));}

    public void accept(RoadBike b){if(carHolders.size() < SIZE) carHolders.add(new RoadBikeHolder(b));}

    public void printAllBikes(){
        carHolders.forEach(b -> b.getBike().printDescription());
    }


}
