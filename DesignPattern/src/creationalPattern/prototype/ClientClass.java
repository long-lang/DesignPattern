package creationalPattern.prototype;

public class ClientClass {
    public static void main(String[] args) {
        //测试原型
  /*      Apple apple = new Apple();
        Apple apple1 = (Apple) apple.clone();
      //  Apple apple1 = apple;
        System.out.println(apple==apple1);*/
       //测试原型管理器
        MyFruit apple = new Apple();
        MyFruit banana = new Banana();
        MyFruitStore.addFruit(1,apple);
        MyFruitStore.addFruit(2,banana);
        MyFruitStore.addFruit(3,new Apple());
        MyFruitStore.addFruit(4,new Banana());

        MyFruit fruit = MyFruitStore.getFruit(3);
        fruit.display();


    }
}
