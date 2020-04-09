package structuralPattern.bridge;

public class BigPen extends  Pen {
    public void draw(String name) {
        String penType = "大号毛笔";
        this.color.bePaint(penType,name);
    }
}
