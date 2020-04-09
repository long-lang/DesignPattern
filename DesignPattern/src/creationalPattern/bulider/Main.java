package creationalPattern.bulider;


//工厂模式和建造者模式
public class Main {
	public static void main(String[] args) {
		ABCreator cr = new Creator01();
		Waiter waiter = new Waiter();
		waiter.setCr(cr);
		Food food = waiter.construct();
		System.out.println(food);
	}
}
