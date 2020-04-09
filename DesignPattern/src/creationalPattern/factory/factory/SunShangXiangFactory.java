package creationalPattern.factory.factory;

public class SunShangXiangFactory extends Factory {
			public Role createRole() {
				return new SunShangXiang();
			}
}
