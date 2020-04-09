package structuralPattern.bridge;

public abstract class Pen {
    protected  Color color;
    public void setColor(Color color){
        this.color = color;
    }
    abstract public void draw(String name);
}
