package structuralPattern.adapter.objectAdapter;

public class Adapter  implements NewJuicer {
    private Oldjuicer oldjuicer;
    @Override
    public String twoPort(MyFruit fruit1, MyFruit fruit2) {
        oldjuicer = new Oldjuicer();
        String mes = "混合果汁"+oldjuicer.onePort(fruit1);
        mes +="  "+oldjuicer.onePort(fruit2);
        return mes;
    }


}
