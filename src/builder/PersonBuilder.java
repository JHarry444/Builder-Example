package builder;

public class PersonBuilder {

	private Person person = new Person();

	public PersonBuilder age(int age) {
		person.setAge(age);
		return this;
	}

	public PersonBuilder height(int height) {
		person.setHeight(height);
		return this;
	}

	public PersonBuilder weight(int weight) {
		person.setWeight(weight);
		return this;
	}

	public PersonBuilder name(String name) {
		person.setName(name);
		return this;
	}

	public PersonBuilder job(String job) {
		person.setJobTitle(job);
		return this;
	}

	public Person build() {
		return this.person;
	}

}
