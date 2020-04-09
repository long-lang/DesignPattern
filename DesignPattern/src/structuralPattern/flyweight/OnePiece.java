package structuralPattern.flyweight;

public class OnePiece extends APiece {
    public OnePiece(String pKind) {
        super(pKind);
    }

    @Override
    public void play(int x, int y) {
        System.out.println("把棋子 "+pKind+"放在了"+"( "+x+","+y+")");
    }
}
