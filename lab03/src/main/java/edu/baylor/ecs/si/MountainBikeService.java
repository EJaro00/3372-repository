package edu.baylor.ecs.si;

public class MountainBikeService extends BasicService{

    @Override
    public void accept(Bicycle b){
        System.out.println("Fixing Bicycle...");
    }

    @Override
    public void accept(MountainBike mb){
        System.out.println("Fixing Mountain Bike...");
    }
}
