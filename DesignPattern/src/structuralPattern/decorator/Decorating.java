package structuralPattern.decorator;

public abstract class Decorating implements IBirthdayCake {
    protected  IBirthdayCake birthdayCake;
    @Override
    abstract public void show();
    public  Decorating(IBirthdayCake birthdayCake){
        this.birthdayCake = birthdayCake;
    }
}
