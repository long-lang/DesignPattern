package structuralPattern.bridge;

public class ClientClass {
    public static void main(String[] args) {
        Pen smallPen = new SmallPen();
        Color red = new Red();
        smallPen.setColor(red);
        smallPen.draw("hh");
    }
}
