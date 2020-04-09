package structuralPattern.adapter.classAdapter;

public class ClientClass {
    public static void main(String[] args) {
        MyFruit apple = new Apple();
        MyFruit banana = new Banana();
        NewJuicer adapter = new Adapter();
        String s = adapter.twoPort(apple, banana);
        System.out.println(s);
    }
}
