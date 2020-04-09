package structuralPattern.Composite;

public class ClientClass{
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Plate plate = new Plate();

        plate.add(apple);
        plate.add(banana);

        Plate plate1 = new Plate();
        plate1.add(plate);
        plate1.add(new Pear());
        plate1.eat();

    }
}
