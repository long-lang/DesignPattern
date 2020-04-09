package behavioralPattern.command;

public class ClientClass {
    public static void main(String[] args) {
        //创建多个订单
        Order order = new Order();
        order.setId(1);
        order.setFruits("苹果",1);
        order.setFruits("香蕉",2);

        Order order1 = new Order();
        order1.setId(2);
        order1.setFruits("橘子",3);
        order1.setFruits("西瓜",4);
        //创建操作者
        Operator operator = new Operator();
        //将多个订单封装为命令对象
        Command orderCommand = new OrderCommand(order,operator);
        Command orderCommand1 = new OrderCommand(order1,operator);
        //创建调用者并加命令
        WaiterInvoker waiter = new WaiterInvoker();
        waiter.setCommand(orderCommand);
        waiter.setCommand(orderCommand1);
        //执行命令
        waiter.orderUp();


    }
}
