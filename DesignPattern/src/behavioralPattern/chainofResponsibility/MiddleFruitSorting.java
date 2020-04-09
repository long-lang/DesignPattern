package behavioralPattern.chainofResponsibility;

public class MiddleFruitSorting extends AbstractFruitSort {
    public MiddleFruitSorting(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("罐头："+fruit);
    }
}
