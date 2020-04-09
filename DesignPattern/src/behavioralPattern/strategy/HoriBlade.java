package behavioralPattern.strategy;

public class HoriBlade implements ICutFruit {
    @Override
    public void cutFruit(String name) {
        System.out.println(name+"被横切");
    }
}
