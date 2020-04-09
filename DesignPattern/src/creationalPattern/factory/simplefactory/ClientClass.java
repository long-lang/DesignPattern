package creationalPattern.factory.simplefactory;

public class ClientClass {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();
        Fruit fruit = factory.createFruit("B");
        fruit.eat();
    }
}
