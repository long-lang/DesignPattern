package behavioralPattern.memento;
/**
 * 备忘录模式
 * @author Administrator
 *
 */
public class ClientClass {
	public static int index = 0;
	public static Caretakerchess caretaker = new Caretakerchess();
	
	public static void play(OriginalChess chess) {
		index++;
		caretaker.addMem(chess.Savetomemto());
		chess.show();	
	}
	
	public static void undo(OriginalChess chess) {
		System.out.println("执行悔棋操作");
		index--;
		chess.Retore(caretaker.getMem(index-1));
		chess.show();
	}
	
	public static void redo(OriginalChess chess) {
		System.out.println("执行撤销操作");
		index++;
		chess.Retore(caretaker.getMem(index-1));
		chess.show();
	}
	//
	public static void main(String[] args) {
		OriginalChess chess = new OriginalChess(new Menmentotchess("黑", 2, 2));
		play(chess);
		chess.setX(6);
		play(chess);
		chess.setY(6);
		play(chess);
		undo(chess);
		undo(chess);
		redo(chess);
		redo(chess);
		
		
		
		
		
		
		
		
		
	}
}
