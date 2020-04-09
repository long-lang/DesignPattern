package creationalPattern.factory.simplefactory;

public class FruitFactory {
    private Fruit fruit;
    public Fruit createFruit(String kind){
        if("A".equals(kind)){
            fruit = new Apple();
        }
        if("B".equals(kind)){
            fruit = new Banana();
        }
        return fruit;
    }
}
