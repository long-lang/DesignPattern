package structuralPattern.flyweight;

import java.util.HashMap;

public class PieceFactory {
    private HashMap  pieces = new HashMap();
    public APiece getPiece(String pKind){
        if(!pieces.containsKey(pKind)){
            APiece onePiece = new OnePiece(pKind);
            pieces.put(pKind,onePiece);
            return onePiece;
        }
        return (APiece) pieces.get(pKind);
    }

    public  int getPieceCount(){
        return  pieces.size();
    }
}
