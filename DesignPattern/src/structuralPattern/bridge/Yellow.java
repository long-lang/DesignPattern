package structuralPattern.bridge;

public class Yellow implements Color {
    @Override
    public void bePaint(String penType, String name) {
        System.out.println("黄色的  "+penType+"绘制了" +name);
    }
}
