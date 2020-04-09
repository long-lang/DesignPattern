package behavioralPattern.memento;

public class OriginalChess {

	protected Menmentotchess mement;

	public OriginalChess(Menmentotchess mement) {
		this.mement = mement;
	}
	
	public void setX(int x) {
		mement.setX(x);
	}

	public void setY(int y) {
		mement.setY(y);
	}
	
	public void show() {
		System.out.println(mement.getLabel()+"位置为  "+mement.getX()+" , "+mement.getY());
	}
	
	public Menmentotchess Savetomemto() {
		return new Menmentotchess(mement.getLabel(),mement.getX(),mement.getY());
	}
	
	public void Retore(Menmentotchess mement) {
		this.mement.label = mement.getLabel();
		this.mement.x = mement.getX();
		this.mement.y = mement.getY();
	}
	
	
}
