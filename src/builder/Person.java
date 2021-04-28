package builder;

public class Person {

	private String name;

	private int age;

	private String jobTitle;

	private int height;

	private int weight;

	public Person(String name, int age, String jobTitle, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.height = height;
		this.weight = weight;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
