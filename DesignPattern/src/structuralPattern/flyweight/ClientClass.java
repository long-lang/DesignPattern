package structuralPattern.flyweight;

import java.util.Random;

public class ClientClass {
    public static void main(String[] args) {
        Random random = new Random();
        PieceFactory factory = new PieceFactory();
        APiece piece = null;
        for(int i = 0;i<19;i++){
            for (int j = 0;j<19;j++){
                if(random.nextInt()%2==0){
                    piece = factory.getPiece("白棋");
                }else{
                    piece = factory.getPiece("黑棋");
                }
                piece.play(random.nextInt(19),random.nextInt(19));
            }
        }
        System.out.println(factory.getPieceCount());
    }
}
