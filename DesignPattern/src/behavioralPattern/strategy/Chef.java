package behavioralPattern.strategy;

public class Chef {
    private ICutFruit cutFruit;
    protected void setCutFruit(ICutFruit cutFruit){
        this.cutFruit = cutFruit;
    }

    protected void cutFruit(String name){
        cutFruit.cutFruit(name);
    }
}
