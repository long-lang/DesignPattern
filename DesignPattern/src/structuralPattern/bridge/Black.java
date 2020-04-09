package structuralPattern.bridge;

public class Black implements Color {
    @Override
    public void bePaint(String penType, String name) {
        System.out.println("黑色的  "+penType+"绘制了" +name);
    }
}
