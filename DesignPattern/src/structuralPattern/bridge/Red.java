package structuralPattern.bridge;

public class Red implements  Color {
    @Override
    public void bePaint(String penType, String name) {
        System.out.println("红色的  "+penType+"绘制了" +name);
    }
}
