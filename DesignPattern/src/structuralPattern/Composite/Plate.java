package structuralPattern.Composite;

import java.util.ArrayList;

public class Plate extends MyElement {
    private ArrayList<MyElement> list = new ArrayList<MyElement>();

    public  void add(MyElement myElement){
        list.add(myElement);
    }

    public  void remove(MyElement myElement){
        list.remove(myElement);
    }

    @Override
    public void eat() {
        for(MyElement myElement:list){
            myElement.eat();
        }
    }
}
