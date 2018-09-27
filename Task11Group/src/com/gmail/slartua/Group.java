package com.gmail.slartua;

import java.util.ArrayList;
import java.util.Collections;

public class Group {
	private ArrayList<Student> group = new ArrayList<>();
	private String groupName;

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void addStudent(Student student) throws FullGroupException {
		if (student == null) {
			throw new IllegalArgumentException("Student null");
		}
		if (group.size() > 10) {
			throw new FullGroupException();
		}
		student.setGroup(this.groupName);
		this.group.add(student);
	}

	public void delStudent(int zachetka) {
		for (int i = 0; i < group.size(); i++) {
			if (this.group.get(i).getZachetka() == zachetka) {
				this.group.remove(i);
				i = 0;
			}
		}
	}

	public void sortByLastName() {
		Collections.sort(this.group);
	}

	public void sortByParameter(int i) {
		Collections.sort(this.group, new StudentComparator(i));
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < group.size(); i++) {
			sb.append(group.get(i).toString() + "\n");
		}
		return "Group" + groupName + "\n" + sb;
	}

}
