package creationalPattern.abstractFactory;

public class AConf implements AFruitandVegetables {
    @Override
    public Fruit createFruit() {
        return new Apple();
    }

    @Override
    public Vegetable createVegetable() {
        return null;
    }
}
