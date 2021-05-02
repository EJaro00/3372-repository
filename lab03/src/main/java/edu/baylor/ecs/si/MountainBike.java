package edu.baylor.ecs.si;

public class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike(int startCadence, int startSpeed, int startGear, Color col, String suspensionType) {
        super(startCadence, startSpeed, startGear, col);
        this.setSuspension(suspensionType);
    }

    public String getSuspension() {
        return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    @Override
    public void printDescription() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "\nSince it is a Mountain Bike, its suspension is " + suspension + ".";
    }

    @Override
    public void visit(BicycleVisitor bv){
        bv.accept(this);
    }
}
