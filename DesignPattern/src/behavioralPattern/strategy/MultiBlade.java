package behavioralPattern.strategy;

public class MultiBlade implements ICutFruit {
    @Override
    public void cutFruit(String name) {
        System.out.println(name+"被切为八块");
    }
}
