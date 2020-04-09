package creationalPattern.abstractFactory;

public class BConf implements BFruitandVegetables {
    @Override
    public Fruit createFruit() {
        return new Banana();
    }

    @Override
    public Vegetable createVegetable() {
        return null;
    }
}
