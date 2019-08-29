package com.cg.bank;

public class Personn {
	private String name;
	private float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public Personn(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Personn [name=" + name + ", age=" + age + "]";
	}
	
	
}
