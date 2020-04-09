package structuralPattern.decorator;

public class Cream extends Decorating {
    public Cream(IBirthdayCake birthdayCake) {
        super(birthdayCake);
    }

    @Override
    public void show() {
        this.birthdayCake.show();
    }

    public  void addCream(){
        System.out.println("add  Cream...");
    }
}
