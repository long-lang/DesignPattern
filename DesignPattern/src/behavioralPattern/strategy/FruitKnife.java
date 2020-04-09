package behavioralPattern.strategy;

public class FruitKnife implements ICutFruit {
    @Override
    public void cutFruit(String name) {
        System.out.println(name+"被小刀切");
    }
}
