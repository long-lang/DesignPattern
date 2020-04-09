package creationalPattern.abstractFactory;

public class ClientClass {
    public static void main(String[] args) {
        AFruitandVegetables aConf = new AConf();
        Fruit fruit = aConf.createFruit();
        fruit.eat();
        AFruitandVegetables aConv = new AconV();
        Vegetable vegetable = aConv.createVegetable();
        vegetable.create();

    }
}
