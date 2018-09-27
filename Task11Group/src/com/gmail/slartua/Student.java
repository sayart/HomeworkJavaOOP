package com.gmail.slartua;

public class Student extends Human implements Comparable<Student> {
	private int zachetka;
	private String group;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int zachetka, String name, String lastName, int age, boolean sex) {
		super(name, lastName, age, sex);
		this.zachetka = zachetka;
	}

	public int getZachetka() {
		return zachetka;
	}

	public void setZachetka(int zachetka) {
		this.zachetka = zachetka;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student [zachetka=" + zachetka + ", group=" + group + " " + super.toString() + "]";
	}

	@Override
	public int compareTo(Student compareStudent) {
		return this.getLastName().compareToIgnoreCase(compareStudent.getLastName());
	}

}
