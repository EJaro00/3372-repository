package edu.baylor.ecs.si;

public class BasicService implements BicycleVisitor{

    public void accept(Bicycle b){
        System.out.println("Fixing Bicycle...");
    }

    public void accept(MountainBike b){System.out.println("Why would you bring a Mountain Bike here?");}

    public void accept(RoadBike b){System.out.println("Why would you bring a Road Bike here?");}
}
