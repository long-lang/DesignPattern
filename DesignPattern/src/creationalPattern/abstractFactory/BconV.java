package creationalPattern.abstractFactory;

public class BconV implements BFruitandVegetables {
    @Override
    public Fruit createFruit() {
        return null;
    }

    @Override
    public Vegetable createVegetable() {
        return new Cabbage();
    }
}
