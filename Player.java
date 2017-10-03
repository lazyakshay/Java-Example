package java_example;

public class Player {
	
	private String name, country;
	private int age;
	
	
	
	public Player() {
		System.out.println("Inside Player class");
	}
	
	public Player(String name, String country, int age) {
		//super();
		this.name = name;
		this.country = country;
		this.age = age;
	}
	
	

	public Player(int age, String name, String country) {
		//super();
		this.age = age;
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
