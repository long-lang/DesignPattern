package behavioralPattern.visitor;

public class SalePerson extends Avisitor {

    @Override
    public void visit(Apple apple) {
        System.out.println("售货员 "+name+":已将苹果过称");
    }

    @Override
    public void visit(Book book) {
        System.out.println("售货员 "+name+":计算出书的价格");
    }
}
