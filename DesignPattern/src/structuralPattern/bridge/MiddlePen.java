package structuralPattern.bridge;

public class MiddlePen extends Pen {
    public void draw(String name) {
        String penType = "中号毛笔";
        this.color.bePaint(penType,name);
    }
}
