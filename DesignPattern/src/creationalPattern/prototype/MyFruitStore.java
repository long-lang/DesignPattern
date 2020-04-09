package creationalPattern.prototype;

import java.util.Hashtable;

public class MyFruitStore {
    private static Hashtable fruitTable = new Hashtable<Integer,MyFruit>();
    public static void addFruit(Integer key,MyFruit fruit){
        fruitTable.put(key,fruit);
    }

    public static MyFruit  getFruit(Integer key){
        MyFruit myFruit = (MyFruit) fruitTable.get(key);
        return (MyFruit) myFruit.clone();
    }
}
