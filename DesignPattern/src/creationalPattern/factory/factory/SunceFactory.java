package creationalPattern.factory.factory;

public class SunceFactory extends Factory {
	public Role createRole() {
		return new SunCe();
	}
}
