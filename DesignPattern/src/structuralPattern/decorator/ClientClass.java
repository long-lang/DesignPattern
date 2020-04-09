package structuralPattern.decorator;

public class ClientClass {
    public static void main(String[] args) {
        IBirthdayCake cake = new Cake();
        Fruit fruit = new Fruit(cake);
        fruit.putFruit();
        Cream cream = new Cream(fruit);
        cream.addCream();
        cream.show();

    }
}
