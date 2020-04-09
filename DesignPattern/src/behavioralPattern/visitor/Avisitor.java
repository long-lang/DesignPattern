package behavioralPattern.visitor;



public abstract class Avisitor {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    abstract  public void visit(Apple apple);
    abstract  public void visit(Book book);


}
