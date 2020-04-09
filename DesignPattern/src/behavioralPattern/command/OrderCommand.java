package behavioralPattern.command;

public class OrderCommand implements Command {
    private Order order;
    private Operator operator;
    public OrderCommand(Order order,Operator operator){
        this.operator = operator;
        this.order = order;
    }
    @Override
    public void execute() {
        System.out.println(order.getId()+"号顾客的商品");
        operator.markFruit(order);
    }
}
