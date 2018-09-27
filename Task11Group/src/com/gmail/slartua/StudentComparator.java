package com.gmail.slartua;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public StudentComparator(int i) {
		super();
		this.i = i;
	}

	public StudentComparator() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Student a, Student b) {
		switch (this.i) {
		case 1:
			return a.getZachetka() - b.getZachetka();
		case 2:
			return a.getName().compareToIgnoreCase(b.getName());
		case 3:
			return a.getLastName().compareToIgnoreCase(b.getLastName());
		case 4:
			return a.getAge() - b.getAge();
		case 5:
			return a.getZachetka() - b.getZachetka();
		}
		return 0;

	}

}
