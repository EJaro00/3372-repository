package edu.baylor.ecs.si;

public enum Color {

    RED(0),
    ORANGE(1),
    YELLOW(2),
    GREEN(3),
    BLUE(4),
    INDIGO(5),
    VIOLET(6),
    BROWN(7),
    BLACK(8),
    WHITE(9),
    GRAY(10);


    public final int identifier;

    private Color(int identifier){
        this.identifier = identifier;
    }
}
