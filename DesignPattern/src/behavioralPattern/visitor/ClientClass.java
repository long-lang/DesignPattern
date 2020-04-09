package behavioralPattern.visitor;

public class ClientClass {
    public static void main(String[] args) {
        IProduct apple = new Apple();
        IProduct apple1 = new Apple();
        IProduct book = new Book();

        BuyBasket buyBasket = new BuyBasket();

        buyBasket.addProduct(apple);
        buyBasket.addProduct(apple1);
        buyBasket.addProduct(book);

        Avisitor visitor = new SalePerson();
        visitor.setName("张三");

        buyBasket.accept(visitor);
    }
}
