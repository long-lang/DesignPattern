package structuralPattern.decorator;

public class Cake implements IBirthdayCake {

    protected  Cake(){
        System.out.println("Cake is being Created");
    }
    public void show() {
        System.out.println("a cake");
    }
}
