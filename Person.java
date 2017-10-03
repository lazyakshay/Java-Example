package java_example;

public class Person {

	private String name;
	private int age;
	public Person() {
		name = "Akshay";
		age = 18;
	}
	public Person(String name, int age) throws InvalidAgeException{
		if(age<18){
			InvalidAgeException ie = new InvalidAgeException("Age is invalid..", age);
			throw ie;
		}
		this.name = name;
		this.age = age;
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
	public void setAge(int age) throws InvalidAgeException {
		if(age<18){
			InvalidAgeException ie = new InvalidAgeException("Age is invalid..", age);
			throw ie;
		}
		this.age = age;
	}
	

}
