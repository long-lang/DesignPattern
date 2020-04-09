package structuralPattern.flyweight;

public abstract  class APiece {
    protected  String pKind;
    public APiece(String pKind){
        this.pKind = pKind;
    }

    public abstract void play(int x,int y);
}
