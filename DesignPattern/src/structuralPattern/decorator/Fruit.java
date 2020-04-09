package structuralPattern.decorator;

public class Fruit extends  Decorating{
    @Override
    public void show() {
       this.birthdayCake.show();
    }

    public Fruit(IBirthdayCake birthdayCake) {
        super(birthdayCake);
    }

    public void putFruit(){
        System.out.println("add  fruits");
    }
}
