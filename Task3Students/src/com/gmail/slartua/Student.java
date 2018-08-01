package com.gmail.slartua;

public class Student extends Human {
	private int zachetka;
	private String groupName;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String firstName, String lastName, int age, boolean sex, int zachetka, String groupName) {
		super(firstName, lastName, age, sex);
		this.zachetka = zachetka;
		this.groupName = groupName;
	}


	public int getZachetka() {
		return zachetka;
	}

	public void setZachetka(int zachetka) {
		this.zachetka = zachetka;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "Student [zachetka=" + zachetka + ", groupName=" + groupName + super.toString();
	}

}
