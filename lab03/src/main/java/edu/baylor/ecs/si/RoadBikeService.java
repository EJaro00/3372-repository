package edu.baylor.ecs.si;

public class RoadBikeService extends BasicService{

    @Override
    public void accept(Bicycle b){
        System.out.println("Fixing Bicycle...");
    }

    @Override
    public void accept(RoadBike rb){
        System.out.println("Fixing Road Bike...");
    }
}
