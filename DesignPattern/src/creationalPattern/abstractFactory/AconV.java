package creationalPattern.abstractFactory;

public class AconV implements AFruitandVegetables {
    @Override
    public Fruit createFruit() {
        return null;
    }

    @Override
    public Vegetable createVegetable() {
        return new Tomato();
    }
}
