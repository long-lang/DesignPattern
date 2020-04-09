package behavioralPattern.command;

public class Operator {
    public  void markFruit(Order order){
        String str = "";
        for(String key:order.getFruits().keySet()){
            str +=key+" "+order.getFruits().get(key).toString()+" ";
        }
        System.out.println("黑暗料理: "+str);

    }
}
