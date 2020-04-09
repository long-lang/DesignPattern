package behavioralPattern.visitor;




public class Customer extends Avisitor {
    @Override
    public void visit(Apple apple) {
        System.out.println("顾客 "+name+" 购买了苹果");
    }

    @Override
    public void visit(Book book) {
        System.out.println("顾客 "+name+" 购买了书");
    }
}
