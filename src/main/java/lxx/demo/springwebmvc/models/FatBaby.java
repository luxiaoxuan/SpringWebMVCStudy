package lxx.demo.springwebmvc.models;

public class FatBaby {

	private int age;

	private String name;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FatBaby() {
	}

	public FatBaby(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
