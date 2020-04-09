package behavioralPattern.chainofResponsibility;

import java.util.Random;

public class ClientClass {
    public static void main(String[] args) {
        AbstractFruitSort big,mid,small;
        big = new BigFruitSorting(9);
        mid = new MiddleFruitSorting(5);
        small = new SmallFruitSorting(2);

        big.setNextFruitSort(mid);
        mid.setNextFruitSort(small);

        Random random = new Random();
        for(int i = 0;i<1000;i++){
            big.sentFruit(random.nextInt(10),"苹果");
        }

        big.getFruitBox();
        mid.getFruitBox();
        small.getFruitBox();


    }
}
