package edu.baylor.ecs.si;

public class RoadBike extends Bicycle{

    private int tireWidth;

    public RoadBike(int startCadence, int startSpeed, int startGear, Color col, int tireWidth) {
        super(startCadence, startSpeed, startGear, col);
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }

    @Override
    public void printDescription() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "\nSince it is a Road bike, it has a tire width of " + tireWidth + ".";
    }

    @Override
    public void visit(BicycleVisitor bv){
        bv.accept(this);
    }
}
