package behavioralPattern.strategy;

public class ClientClass {
    public static void main(String[] args) {
        Chef chef = new Chef();
        ICutFruit cutFruit = new HoriBlade();
        chef.setCutFruit(cutFruit);
        chef.cutFruit("香蕉");
    }
}
