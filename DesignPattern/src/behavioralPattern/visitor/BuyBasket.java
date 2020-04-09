package behavioralPattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class BuyBasket {
    private ArrayList<IProduct> list = null;
    public BuyBasket(){
        list = new ArrayList<>();
    }

    public void accept(Avisitor avisitor){
        Iterator<IProduct> iterator = list.iterator();
        while(iterator.hasNext()){
            iterator.next().accept(avisitor);
        }
    }

    public void addProduct(IProduct product){
        list.add(product);
    }

    public void removeProduct(IProduct product){
        list.remove(product);
    }

}
