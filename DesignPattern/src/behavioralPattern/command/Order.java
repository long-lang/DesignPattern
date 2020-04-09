package behavioralPattern.command;

import java.util.HashMap;

public class Order {
    private HashMap<String,Integer> fruits = null;
    private int id;

    public HashMap<String, Integer> getFruits() {
        return fruits;
    }

    public void setFruits(String fruit,Integer quantity) {
        fruits.put(fruit,quantity);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  Order(){
        fruits = new HashMap<String,Integer>();
    }


}
