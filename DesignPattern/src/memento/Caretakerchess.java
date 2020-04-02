package memento;

import java.util.ArrayList;

public class Caretakerchess {
	protected ArrayList<Menmentotchess> mements  =  new ArrayList<Menmentotchess>();
	
	public void addMem(Menmentotchess mem) {
		mements.add(mem);
	}
	
	public Menmentotchess getMem(int index) {
		return mements.get(index);
	}
}
