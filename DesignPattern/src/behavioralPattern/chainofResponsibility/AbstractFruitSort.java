package behavioralPattern.chainofResponsibility;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFruitSort {
    private  int weight;
    protected List<String> fruitBox = null;
    private  AbstractFruitSort  nextFruitSort;

    public  AbstractFruitSort(int weight){
        this.weight = weight;
        fruitBox = new ArrayList<>();
    }

    public void getFruitBox(){
        System.out.print("Weight："+weight);
        System.out.println(" 个数为："+fruitBox.size());
        for (String fruit : fruitBox){
            System.out.print(fruit+" ");
        }
        System.out.println("");
    }

    public void sentFruit(int weight,String fruit){
        if(this.weight<=weight){
            pushBox(fruit);
        }else{
            if(nextFruitSort!=null){
                nextFruitSort.sentFruit(weight,fruit);
            }
        }
    }

    public void setNextFruitSort(AbstractFruitSort nextFruitSort){
        this.nextFruitSort = nextFruitSort;
    }

    abstract protected void pushBox(String fruit);
}
