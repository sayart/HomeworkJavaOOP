package com.gmail.slartua;

public abstract class Human {
	private String firstName;
	private String lastName;
	private int age;
	private boolean sex;

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Human(String firstName, String lastName, int age, boolean sex) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return " firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", sex=" + sex + "]";
	}

}
