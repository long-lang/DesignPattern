package behavioralPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class BuyHolder implements IStockHolder {
	private List<AStockPrice> attentionList;
	private String name;
	public BuyHolder(String name) {
		attentionList=new ArrayList<AStockPrice>();
		this.name=name;
	}

	@Override
	public void update(AStockPrice asp) {
		// TODO Auto-generated method stub
		if(attentionList.contains(asp)) {
			System.out.println(name);
			if(asp.getPrice()-asp.getPrice2()>0) {
				System.out.println(asp.code+":");
				System.out.println("原价："+asp.price2+"现价："+asp.price);
				System.out.println("涨了 笑");
			}
			else {
				System.out.println(asp.code+":");
				System.out.println("原价："+asp.price2+"现价："+asp.price);
				System.out.println("跌了 哭");
			}
		}

	}

	@Override
	public void AddHolder(AStockPrice asp) {
		// TODO Auto-generated method stub
		attentionList.add(asp);
		asp.Add(this);
	}

}
