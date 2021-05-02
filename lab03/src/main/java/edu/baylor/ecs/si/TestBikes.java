package edu.baylor.ecs.si;

public class TestBikes {
    public static void main(String[] args) {
        Bicycle bike01, bike02, bike03;

        bike01 = new Bicycle(20, 10, 1, Color.BLUE);
        bike02 = new MountainBike(20, 10, 5, Color.GREEN, "Dual");
        bike03 = new RoadBike(40, 20, 8, Color.YELLOW, 23);

        bike01.printDescription();
        bike02.printDescription();
        bike03.printDescription();


        BasicService service1 = new BasicService();
        BasicService service2 = new MountainBikeService();
        BasicService service3 = new RoadBikeService();

        System.out.println("\nSingle dispatch:");
        service1.accept(bike01);
        service2.accept(bike02);
        service3.accept(bike03);


        System.out.println("\nDouble dispatch:");
        bike01.visit(service1);
        bike02.visit(service2);
        bike03.visit(service3);

        Car mazda3 = new Car();
        Bicycle bike04 = new Bicycle(86, 15, 5, Color.RED);

        bike01.visit(mazda3);
        bike02.visit(mazda3);
        bike03.visit(mazda3);
        bike04.visit(mazda3);

        System.out.println("My Mazda 3: ");
        mazda3.printAllBikes();
        System.out.println();

        AnyHolderCar<Bicycle> uHaul = new AnyHolderCar<>();
        uHaul.accept(bike04);
        uHaul.accept(bike03);
        uHaul.accept(bike02);
        uHaul.accept(bike01);

        System.out.println("U-Haul Truck: ");
        uHaul.getCarHolders().forEach(bicycleAnyHolder -> System.out.println(bicycleAnyHolder.getItem()));

    }
}
