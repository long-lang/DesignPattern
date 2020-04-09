package behavioralPattern.visitor;

public class Apple implements IProduct{
    @Override
    public void accept(Avisitor visitor) {
        visitor.visit(this);
    }
}
