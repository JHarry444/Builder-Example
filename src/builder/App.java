package builder;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person("jh", 27, "trainer", 180, 99999);

		Person p3 = new Person();
		p3.setAge(0);
		p3.setHeight(0);

		PersonBuilder pb = new PersonBuilder();

		Person p2 = pb.age(27).name("jh").job("trainer").build();
	}

}
