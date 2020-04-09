package behavioralPattern.visitor;

public class Book implements IProduct {
    @Override
    public void accept(Avisitor visitor) {
        visitor.visit(this);
    }
}
