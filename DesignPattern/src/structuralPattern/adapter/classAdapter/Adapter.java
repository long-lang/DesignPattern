package structuralPattern.adapter.classAdapter;

public class Adapter extends Oldjuicer implements NewJuicer {
    @Override
    public String twoPort(MyFruit fruit1, MyFruit fruit2) {
        String mes = "混合果汁"+onePort(fruit1);
        mes +="  "+onePort(fruit2);
        return mes;
    }


}
