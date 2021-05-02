package edu.baylor.ecs.si;

public class Bicycle {
    public int cadence;
    public int gear;
    public int speed;
    public Color color;

    public Bicycle(int startCadence, int startSpeed, int startGear, Color col) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
        color = col;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void printDescription(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "\nBike is colored " + color.name() + ", in gear " + this.gear
                + " with a cadence of " + this.cadence +
                " and travelling at a speed of " + this.speed + ". ";
    }

    public void visit(BicycleVisitor bv){
        bv.accept(this);
    }
}
